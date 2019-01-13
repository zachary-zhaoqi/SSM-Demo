package pers.zhaoqi.dao;

import org.apache.ibatis.annotations.Param;
import pers.zhaoqi.entity.Book;

import java.util.List;

public interface BookDao {
    /**
     * 通过ID查询单本图书
     *
     * @param id 图书id
     * @return 单个图书实体
     * */
    Book queryById(long id);

    /**
     * 查询所有图书
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return list<Book>
     */
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 馆藏数量减少1
     *
     * @param bookId 图书id
     * @return 如果影响行数等于>1，表示更新的记录行数
     */
    int reduceNumber(long bookId);
}
