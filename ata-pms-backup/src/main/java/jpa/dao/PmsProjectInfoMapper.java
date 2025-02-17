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
import net.atayun.bazooka.pms.api.dto.PmsProjectInfoDto;
import net.atayun.bazooka.pms.api.dto.ProjectCountDto;
import net.atayun.bazooka.pms.biz.dal.entity.PmsProjectInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author rache
 * @date 2019-07-16
 */
public interface PmsProjectInfoMapper extends YyMapper<PmsProjectInfoEntity> {
    /**
     * 包含被删除的部分
     * @param projectName
     * @param projectCode
     * @return
     */
    Integer countProjectInfo(@Param("projectName") String projectName,
                             @Param("projectCode") String projectCode,
                             @Param("projectId") Long projectId);
    List<ProjectCountDto> queryProjectCount(@Param("keyWord") String keyWord);
    List<PmsProjectInfoDto> queryProjectListForAdmin(@Param("userId") Long userId);
}
