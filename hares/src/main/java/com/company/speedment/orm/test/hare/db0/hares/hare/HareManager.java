package com.company.speedment.orm.test.hare.db0.hares.hare;

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
 * A manager representing an entity (for example, a row) in the Table 'hare.db0.hares.hare'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public interface HareManager extends SqlManager<Integer, Hare, HareBuilder> {
    
    @Override
    default Integer primaryKeyFor(Hare entity) {
        return entity.getId();
    }
    
    @Override
    default Table getTable() {
        return Platform.get().get(ProjectComponent.class).getProject().findTableByName("db0.hares.hare");
    }
    
    @Override
    default Class<HareManager> getManagerClass() {
        return HareManager.class;
    }
    
    @Override
    default Class<Hare> getEntityClass() {
        return Hare.class;
    }
    
    @Override
    default Class<HareBuilder> getBuilderClass() {
        return HareBuilder.class;
    }
    
    @Override
    default Object get(Hare entity, Column column) {
        switch (column.getName()) {
            case "id" : return entity.getId();
            case "name" : return entity.getName();
            case "color" : return entity.getColor();
            case "age" : return entity.getAge();
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @Override
    default void set(HareBuilder entity, Column column, Object value) {
        switch (column.getName()) {
            case "id" : entity.setId((Integer) value); break;
            case "name" : entity.setName((String) value); break;
            case "color" : entity.setColor((String) value); break;
            case "age" : entity.setAge((Integer) value); break;
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @SuppressWarnings("unchecked")
    static HareManager get() {
        return Platform.get().get(ManagerComponent.class).manager(HareManager.class);
    }
}