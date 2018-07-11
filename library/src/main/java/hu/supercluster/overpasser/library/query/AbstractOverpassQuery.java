package hu.supercluster.overpasser.library.query;

abstract class AbstractOverpassQuery {
    protected OverpassQueryBuilder builder;

    AbstractOverpassQuery() {
        this(new OverpassQueryBuilderImpl());
    }

    AbstractOverpassQuery(OverpassQueryBuilder builder) {
        this.builder = builder;
    }

    public void onSubQueryResult(AbstractOverpassSubQuery subQuery, boolean recursive) {
        builder.append(subQuery.build(recursive));
    }

    protected abstract String build(boolean recursive);
}
