package com.company.speedment.orm.test.hare.db0.hares.carrot.impl;

import com.company.speedment.orm.test.hare.db0.hares.carrot.Carrot;
import com.company.speedment.orm.test.hare.db0.hares.carrot.CarrotBuilder;
import com.company.speedment.orm.test.hare.db0.hares.carrot.CarrotManager;
import com.speedment.orm.core.manager.sql.AbstractSqlManager;
import java.lang.RuntimeException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * A manager implementation representing an entity (for example, a row) in the Table 'hare.db0.hares.carrot'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class CarrotManagerImpl extends AbstractSqlManager<Integer, Carrot, CarrotBuilder> implements CarrotManager {
    
    public CarrotManagerImpl() {
        setSqlEntityMapper(this::defaultReadEntity);
    }
    
    @Override
    public CarrotBuilder builder() {
        return new CarrotImpl();
    }
    
    @Override
    public CarrotBuilder toBuilder(Carrot prototype) {
        return new CarrotImpl(prototype);
    }
    
    protected Carrot defaultReadEntity(ResultSet resultSet) {
        final CarrotBuilder builder = builder();
        try {
            builder.setId(resultSet.getInt("id"));
            builder.setName(resultSet.getString("name"));
            builder.setOwner(resultSet.getInt("owner"));
            builder.setRival(resultSet.getInt("rival"));
        }
        catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
        return builder;
    }
}