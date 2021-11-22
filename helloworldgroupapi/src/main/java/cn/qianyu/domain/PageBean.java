package cn.qianyu.domain;

import lombok.Data;

import javax.persistence.Table;
import java.util.List;

/**
 * page对象
 * @param <T>
 */
@Data
public class PageBean<T> {
    private int totalCount;//总记录数
    private int totalPage;//总页码
    private int currentPage;//当前页码
    private int pageSize;//每页显示的条数
    private int start;//开始的页码

    private List<T> list;//返回的对象数据


}
