/*
 *    Copyright 2018-2019 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package jpa.entity;

import com.youyu.common.entity.JdbcMysqlEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;

/**
 * @author rache
 * @date 2019-07-12
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name = "pms_project_env_relation")
public class PmsProjectEnvRelationEntity extends JdbcMysqlEntity<Long> {
    public PmsProjectEnvRelationEntity(Long projectId, Long envId) {
        this.projectId = projectId;
        this.envId = envId;
    }
    private Long clusterId;
    private Long projectId;
    private Long envId;
    private Integer portStart;
    private Integer portEnd;

}
