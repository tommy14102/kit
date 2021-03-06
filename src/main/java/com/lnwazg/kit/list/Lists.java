package com.lnwazg.kit.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List的常用工具类<br>
 * 仿scala的用法
 * @author nan.li
 * @version 2016年7月21日
 */
public class Lists
{
    public static List<Integer> asList(int beginNum, int endNum)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = beginNum; i <= endNum; i++)
        {
            list.add(i);
        }
        return list;
    }
    
    /**
     * 快速生成一个List
     * @author nan.li
     * @param objects
     * @return
     */
    public static List<Object> asList(Object... objects)
    {
        List<Object> ret = new ArrayList<>();
        for (Object o : objects)
        {
            ret.add(o);
        }
        return ret;
    }
    
    public static boolean isNotEmpty(List<?> list)
    {
        if (list != null && list.size() > 0)
        {
            return true;
        }
        return false;
    }
}
