package com.summer.tiny.structure.mylist;


/**
 * @Author：yuanwei
 * @Date: 2020/9/11
 * @Email: yuanwei@ebupt.com
 * @Description: 动态数组
 */
public class ArrayList {

    /**
     *  数组默认长度
     */
    private static final Integer DEFAULT_CAPACITY = 10;

    /**
     *  常量 0
     */
    private static final Integer COMMON_ZERO = 0;

    /**
     *  常量 1
     */
    private static final Integer COMMON_ONE = 1;

    /**
     *  常量 -1
     */
    private static final Integer COMMON_NEGATIVE_ONE = -1;



    /**
     *  内部数组元素
     */
    private Integer[] elements;

    /**
     * 列表大小
     */
    private Integer size;

    /**
     *  当前容量
     */
    private Integer currentCapacity;


    /**
     *  无参构造
     */
    public ArrayList() {
        this.elements = new Integer[DEFAULT_CAPACITY];
        // 当前容量赋值
        currentCapacity = DEFAULT_CAPACITY;
        size = COMMON_ZERO;
    }

    /**
     *  含参构造，设置初始长度
     * @param capacity 列表初始长度
     */
    public ArrayList(Integer capacity) {
        // 参数校验
        if (capacity < COMMON_ZERO || capacity > Integer.MAX_VALUE){
            throw new IllegalArgumentException("Capacity is positive integer");
        }
        if(capacity < DEFAULT_CAPACITY){
            this.elements = new Integer[DEFAULT_CAPACITY];
            // 当前容量赋值
            currentCapacity = DEFAULT_CAPACITY;
        }else{
            this.elements = new Integer[capacity];
            // 当前容量赋值
            currentCapacity = capacity;
        }
        size = COMMON_ZERO;
    }

    /**
     *  带参构造
     * @param array 初始化列表
     */
    public ArrayList(Integer[] array) {
      this.elements =  array;
        size = array.length;
        // 当前容量赋值
        currentCapacity = array.length;
        size = currentCapacity;
    }


    /**
     *  获取列表大小
     * @return 列表大小
     */
    public Integer size(){
        return size;
    }


    /**
     *  清除列表
     *   # size 置为 0， 实际上的列表并未消失，内存重复利用
     *      根据实际情况 决定内从的重复利用情况
     */
    public void clear(){
        size = COMMON_ZERO;
    }


    /**
     *  获取对应下标位置处的元素
     * @param index 下标
     * @return 下标独赢元素
     */
    public Integer get(int index){
       /* if( index < COMMON_ZERO || index >= size){
            throw new IndexOutOfBoundsException("Size = " + size +",index error: "+index);
        }*/
        indexCheck(index);
        return elements[index];
    }


    /**
     * 更新独赢下标的值
     * @param index 下标
     * @param element  值
     * @return 原值
     */
    public Integer set(int index,Integer element){
        // 小标判断
        indexCheck(index);
        // 获取原值
        Integer oldValue = elements[index];
        // 赋值新值
        elements[index] = element;
        return oldValue;
    }

    /**
     *  向列表添加元素
     * @param element 待添加元素
     */
    public void add(Integer element){
        // 判断是否需要扩容
        if (ensureCapacity()){
            // 扩容操作
            increaseCapacity();
        }
        // 添加新元素
        elements[size] = element;
        // size +1
        size++;
    }

    /**
     *  判断改元素是否存在与列表中
     *  若存在多个，默认返回第一个元素下标，
     *  不存在则返回 -1
     * @param element 元素
     * @return 元素下标
     */
    public int contain(Integer element){
        //ContainRes containRes = new ContainRes();
        for (int i = 0; i < size; i++) {
            if(elements[i] == element){
                return i;
            }
        }
        return COMMON_NEGATIVE_ONE;
    }


    /*class ContainRes{
        Integer index;
        Integer count;
    }
*/


    /**
     *  移除元素 ，多个相同元素时，默认移除第一个
     * @param element
     */
    public boolean remove(Integer element){
        int containIndex = contain(element);
        if( COMMON_NEGATIVE_ONE == containIndex){
            return false;
        }
        // 移除操作
        for (int i = 0; i < size; i++) {
            if( i > containIndex){
                elements[i-1] = elements[i];
            }
        }

        // 长度 自减
        elements[--size ] = null;
        return true;
    }

    /**
     *  打印列表
     * @return 列表的字符串形式
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
            builder.append("Size = ").append(size).append(",{");

            for (int i = 0; i < size; i++) {
                if( i == COMMON_ZERO){
                    builder.append(elements[COMMON_ZERO]);
                }else{
                    builder.append(", ").append(elements[i]);
                }

            }

            builder.append("}");
        return builder.toString();
    }

    /**
     *  下标检验
     * @param index 下标
     */
    private void indexCheck(int index){
        if( index < COMMON_ZERO || index >= size){
            throw new IndexOutOfBoundsException("Size = " + size +",index error: "+index);
        }
    }


    /**
     *  判断 是否需要扩容
     * @return false - 不需要扩容  true 需要扩容
     */
    private boolean ensureCapacity(){
        if( size < currentCapacity){
            return false;
        }
        return true;
    }

    /**
     *  扩容操作
     */
    private void increaseCapacity(){
        int newCapacity = currentCapacity<<1;
        Integer[] newElements = new Integer[newCapacity];
        System.arraycopy(elements,COMMON_ZERO,newElements,COMMON_ZERO,size);
        elements = newElements;
        currentCapacity = newCapacity;
    }
}
