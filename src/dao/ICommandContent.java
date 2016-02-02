package dao;

import bean.CommandContent;

import java.util.List;

/**
 * 与CommandContent配置文件相对应的接口
 */
public interface ICommandContent {
    /**
     * 单条新增
     */
    void insertOne(CommandContent content);

    /**
     * 批量新增
     */
    void insertBatch(List<CommandContent> content);
}
