package com.company.speedment.orm.test.hare.db0.hares.carrot;

import com.speedment.orm.config.model.Column;
import com.speedment.orm.config.model.Table;
import com.speedment.orm.core.manager.sql.SqlManager;
import com.speedment.orm.platform.Platform;
import com.speedment.orm.platform.component.ManagerComponent;
import com.speedment.orm.platform.component.ProjectComponent;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Generated;

/**
 * A manager representing an entity (for example, a row) in the Table 'hare.db0.hares.carrot'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public interface CarrotManager extends SqlManager<Integer, Carrot, CarrotBuilder> {
    
    @Override
    default Integer primaryKeyFor(Carrot entity) {
        return entity.getId();
    }
    
    @Override
    default Table getTable() {
        return Platform.get().get(ProjectComponent.class).getProject().findTableByName("db0.hares.carrot");
    }
    
    @Override
    default Class<CarrotManager> getManagerClass() {
        return CarrotManager.class;
    }
    
    @Override
    default Class<Carrot> getEntityClass() {
        return Carrot.class;
    }
    
    @Override
    default Class<CarrotBuilder> getBuilderClass() {
        return CarrotBuilder.class;
    }
    
    @Override
    default Object get(Carrot entity, Column column) {
        switch (column.getName()) {
            case "id" : return entity.getId();
            case "name" : return entity.getName();
            case "owner" : return entity.getOwner();
            case "rival" : return entity.getRival();
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @Override
    default void set(CarrotBuilder entity, Column column, Object value) {
        switch (column.getName()) {
            case "id" : entity.setId((Integer) value); break;
            case "name" : entity.setName((String) value); break;
            case "owner" : entity.setOwner((Integer) value); break;
            case "rival" : entity.setRival((Integer) value); break;
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @SuppressWarnings("unchecked")
    static CarrotManager get() {
        return Platform.get().get(ManagerComponent.class).manager(CarrotManager.class);
    }
}