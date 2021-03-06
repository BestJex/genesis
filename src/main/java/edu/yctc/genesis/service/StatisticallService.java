package edu.yctc.genesis.service;

import java.util.Map;

public interface StatisticallService {

    /**
     * 获得教室占用状况
     * 
     * @return
     */
    Map<String, Integer> getClassroomUsingState();
}
