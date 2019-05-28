package ir.maktabsharif.core.dao;

import org.hibernate.SessionFactory;

public class GeneralCRUDDao extends BaseDaoImpl {

    private String entityName;

    public GeneralCRUDDao(SessionFactory factory, String entityName) {
        super(factory);
        this.entityName = entityName;

    }

    @Override
    protected String getEntity() {
        return entityName;
    }
}
