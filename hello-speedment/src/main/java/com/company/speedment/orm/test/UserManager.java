/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.company.speedment.orm.test;

import com.speedment.orm.config.model.Column;
import com.speedment.orm.config.model.Table;
import com.speedment.orm.core.manager.Manager;
import com.speedment.orm.platform.Platform;
import com.speedment.orm.platform.component.ManagerComponent;
import com.speedment.orm.platform.component.ProjectComponent;
import java.lang.IllegalArgumentException;
import javax.annotation.Generated;

/**
 * A manager representing an entity (for example, a row) in the Table 'Hello Speedment Project.db0.hellospeedment'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public interface UserManager extends Manager<Integer, User, UserBuilder> {
    
    @Override
    default Integer primaryKeyFor(User entity) {
        return entity.getId();
    }
    
    @Override
    default Table getTable() {
        return Platform.get().get(ProjectComponent.class).getProject().findTableByName("Hello Speedment Project.db0.hellospeedment");
    }
    
    @Override
    default Class<UserManager> getManagerClass() {
        return UserManager.class;
    }
    
    @Override
    default Class<User> getEntityClass() {
        return User.class;
    }
    
    @Override
    default Class<UserBuilder> getBuilderClass() {
        return UserBuilder.class;
    }
    
    @Override
    default Object get(User entity, Column column) {
        switch (column.getName()) {
            case "mail" : return entity.getMail();
            case "id" : return entity.getId();
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @SuppressWarnings("unchecked")
    static UserManager get() {
        return (UserManager) Platform.get().get(ManagerComponent.class).manager(UserManager.class);
    }
}