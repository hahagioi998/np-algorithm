

import java.util.Map;



/**
 * 基础方法
 * @param <T>
 * @author liuhouer
 */
public interface BasicGraphInterface<T> {
    /**
     * @param vertexLabel 标记新顶点的对象
     * @Task:将给定的顶点插入图
     */
    public void addVertex(T vertexLabel);

    /**
     * @param vertexLabel 标记新顶点的对象
     * @Task:将给定的顶点插入图
     */
    public void addVertex(T vertexLabel, int index);

    public void addVertex(T vertexLabel, Map<String, String> diminfos);

    /**
     * @param begin 标识边的起点
     * @param end   标识边的终点
     * @return 若插入成功, 返回true, 否则返回false
     * @Task 在图的指定顶点间插入一条加权边, 这两个顶点之间在插入边之前不能有边
     */
    public boolean addEdge(T begin, T end, double edgeWeight);

    public boolean addEdge(T begin, T end);

    public boolean addEdge(T begin, T end, Map<String, String> colInfo);

    /**
     * @param begin 标识边的起点的对象
     * @param end   标识边的终点的对象
     * @return 若有边则返回true
     * @Task 检查两个指定的顶点之间是否存在边
     */
    public boolean hasEdge(T begin, T end);

    /**
     * @param begin 标识边的起点的对象
     * @param end   标识边的终点的对象
     * @return 若有边则返回边
     * @Task 返回两个指定的顶点之间的边对象
     */
    public Edge getEdge(T begin, T end);

    public boolean isEmpty();//检查图是否为空

    public int getSizeOfVertices();//获得图中顶点的个数

    public int getSizeOfEdges();//获得图中的边的条数

    public void clear();//删除图中所有的顶点与边

    public void printVertex();
}
