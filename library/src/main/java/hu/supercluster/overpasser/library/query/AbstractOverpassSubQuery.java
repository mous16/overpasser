package hu.supercluster.overpasser.library.query;

abstract class AbstractOverpassSubQuery extends AbstractOverpassQuery {
    private OverpassQuery parent;

    public AbstractOverpassSubQuery(OverpassQuery parent) {
        super();
        this.parent = parent;
    }

    AbstractOverpassSubQuery(OverpassQuery parent, OverpassQueryBuilder builder) {
        super(builder);
        this.parent = parent;
    }

    public final OverpassQuery end(boolean recursive) {
        parent.onSubQueryResult(this, recursive);

        return parent;
    }
}
