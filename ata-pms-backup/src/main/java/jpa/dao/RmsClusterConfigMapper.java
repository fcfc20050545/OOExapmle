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
package jpa.dao;

import com.youyu.common.mapper.YyMapper;
import net.atayun.bazooka.pms.biz.dal.entity.RmsClusterConfigEntity;

import java.util.List;

/**
 * @author pqq
 * @version v1.0
 * @date 2019年7月17日 17:00:00
 * @work 资源集群配置 mapper
 */
public interface RmsClusterConfigMapper extends YyMapper<RmsClusterConfigEntity> {

    /**
     * 根据集群id查询集群配置信息
     *
     * @param clusterId
     * @return
     */
    List<RmsClusterConfigEntity> getByClusterId(Long clusterId);

    /**
     * 根据集群id查询一个有效的marathon地址
     *
     * @param clusterId
     * @return
     */
    String getOneValidMarathonUrlByClusterId(Long clusterId);
}




