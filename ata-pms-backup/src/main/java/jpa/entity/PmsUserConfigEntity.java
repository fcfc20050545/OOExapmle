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
import lombok.Data;
import net.atayun.bazooka.pms.api.enums.ConfigTitleEnum;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author rache
 * @date 2019-07-12
 */
@Data
@Table(name = "pms_user_config")
public class PmsUserConfigEntity extends JdbcMysqlEntity<Long> {
    private Long userId;
    @Column(name="config_title")
    private ConfigTitleEnum configTitle;
    private String configBody;
}
