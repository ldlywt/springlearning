package com.ldlywt.springlearning.service;

import com.ldlywt.springlearning.entity.Area;

import java.util.List;

/**
 * <pre>
 *     author : lex
 *     e-mail : ldlywt@163.com
 *     time   : 2018/05/28
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public interface AreaService {
    /**
     * 获取区域列表
     *
     * @return
     */
    List<Area> getAreaList();

    /**
     * 通过区域Id获取区域信息
     *
     * @param areaId
     * @return
     */
    Area getAreaById(int areaId);

    /**
     * 增加区域信息
     *
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 修改区域信息
     *
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 删除区域信息
     *
     * @return
     */
    boolean deleteArea(int areaId);
}
