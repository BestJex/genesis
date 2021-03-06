package edu.yctc.genesis.controller;

import org.springframework.ui.Model;

public interface EducationController {

    /**
     * 展示管理员-权限管理功能页面
     * 
     * @param model
     * @return
     */
    String showAuthorityManagement(Model model);

    /**
     * 展示管理员-教室直播功能页面
     *
     * @return
     */
    String showClassroomLive();

    /**
     * 展示管理员-导入学生数据功能页面
     * 
     * @return
     */
    String showImportStudents();

    /**
     * 球机管理页
     * 
     * @return
     */
    String showCameraControl();

    /**
     * 展示权限管理-角色管理功能页面
     * 
     * @param model
     * @return
     */
    String showAuthorityRoleManagement(Model model);

    /**
     * 展示权限管理-角色管理-增加角色功能页面
     * 
     * @param model
     * @return
     */
    String showAuthorityRoleManagementAdd(Model model);

    /**
     * 展示权限管理-角色管理-修改角色功能页面
     * 
     * @param model
     * @return
     */
    String showAuthorityRoleManagementModify(Model model);

}
