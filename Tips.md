# 数组方法

1. Array.push()，向数组的末尾添加一个或多个元素，并返回新的数组长度。原数组改变。

``` javascript
    let arr = [1,2,3,4]
    arr.push(5,6,7)
    console.log(arr) // 1,2,3,4,5,6,7
```

2. Array.pop()，删除并返回数组的最后一个元素，若该数组为空，则返回undefined。原数组改变。

``` javascript
    let arr = [1,2,3,4]
    arr.pop()
    console.log(arr) // 1,2,3
```

3. Array.unshift()，向数组的开头添加一个或多个元素，并返回新的数组长度。原数组改变。

``` javascript
    let arr = [1,2,3,4]
    arr.unshift(0)
    console.log(arr) // 0,1,2,3,4
```

4. Array.shift()，删除数组的第一项，并返回第一个元素的值。若该数组为空，则返回undefined。原数组改变。

``` javascript
    let arr = [1,2,3,4]
    arr.unshift()
    console.log(arr) // 2,3,4
```

5. Array.concat(arr1,arr2…)，合并两个或多个数组，生成一个新的数组。原数组不变。

``` javascript
    let arr1 = [1,2,3,4]
    let arr2 = [5,6,7]
    let arr = arr1.concat(arr2)
    console.log(arr) // 1,2,3,4,5,6,7
```

6. Array.join()，将数组的每一项用指定字符连接形成一个字符串。默认连接字符为 “,” 逗号。

``` javascript
    let arr = [1,2,3,4]
    let str1 = arr.join()
    let str2 = arr.join('-)
    console.log(str1,str2) // 1,2,3,4  1-2-3-4
```

7. Array.reverse()，将数组倒序。原数组改变。

``` javascript
    let arr = [1,2,3,4]
    arr.reverse()
    console.log(arr) // 4,3,2,1
```

8. Array.sort()，对数组元素进行排序。按照字符串UniCode码排序，原数组改变。
   1. 从小到大
    ``` javascript
        function sortNum(a,b){
            return a - b
        }
        let arr = [4,3,2,1]
        arr.sort(sortNum)
        console.log(arr) // 1,2,3,4
    ```
   2. 从大到小
    ``` javascript
        function sortNum(a,b){
            return b - a
        }
        let arr = [4,3,2,1]
        console.log(arr) // 4,3,2,1
    ```
   3. 按照数组对象中的某个值进行排序
    ``` javascript
        function sortNum(param){
            return function(a,b){
                return a[param] - b[param]
            }
        }
        let arr = [
            {name:'张三',age:'18'},
            {name:'李四',age:'20'},
            {name:'王五',age:'17'},
            {name:'赵六',age:'28'}
        ]
        arr.sort(sortNum('age'))
        console.log(arr) // 4,3,2,1
    ```

9. Array.map(function)，原数组的每一项执行函数后，返回一个新的数组。原数组不变。（注意该方法和forEach的区别）。

``` javascript
    let arr1 = [1, 2, 3, 4]
    let arr = arr1.map((item) => {
        item++;
        return item
    })
    console.log(arr) // 2,3,4,5
```

10.  Array.slice() 按照条件查找出其中的部分内容,返回一个新数组不改变原数组
    1. array.slice(n, m)，从索引n开始查找到m处（不包含m）
    2. array.slice(n, m)，从索引n开始查找到m处（不包含m）
    3. array.slice(0)原样输出内容，可以实现数组克隆
    4. array.slice(-n,-m) slice支持负参数，从最后一项开始算起，-1为最后一项，-2为倒数第二项

``` javascript
    let arr1 = [1,2,3,4]
    let arr = arr.slice(-3,-1)
    console.log(arr) // 2,3
```

11. Array.splice(index,howmany,arr1,arr2…) ，用于添加或删除数组中的元素。从index位置开始删除howmany个元素，并将arr1、arr2…数据从index位置依次插入。howmany为0时，则不删除元素。原数组改变。

``` javascript
    let arr = [1,2,3,4]
    arr.splice(3,0,5,6,7)
    console.log(arr) // 1,2,3,4,5,6,7
```

12. Array.forEach(function)，用于调用数组的每个元素，并将元素传递给回调函数。原数组不变。（注意该方法和map的区别，若直接打印Array.forEach，结果为undefined即forEach是没有返回值的！）。

``` javascript
    let arr = [1,2,3,4]
    let res = arr.forEach(function(item,index) {
        console.log(`数组第${index+1}个元素是${item}`); // 巴拉巴拉
    })
    console.log(res);//undefined,
```

13. Array.filter(function)，过滤数组中，返回true收集符合条件的元素，并返回一个新的数组。不改变原数组

``` javascript
    let arr1 = [1,2,3,4]
    let arr = arr1.filter((item)=> item > 3)
    console.log(arr) // 4
```

14. Array.every(function)，对数组中的每一项进行判断，若都符合则返回true，否则返回false。不改变原数组

``` javascript
    let arr = [1,2,3,4]
    let bool1 = arr.every((item)=> item > 1)
    let bool2 = arr.every((item)=> item >= 1)
    console.log(bool1) // false
    console.log(bool2) // true
``` 

15. Array.some(function)，对数组中的每一项进行判断，若都不符合则返回false，否则返回true。

``` javascript
    let arr = [1,2,3,4]
    let bool1 = arr.some((item)=> item > 4)
    let bool2 = arr.some((item)=> item > 2)
    console.log(bool1) // false
    console.log(bool2) // true
``` 

16. Array.reduce(function)，reduce() 方法接收一个函数作为累加器，数组中的每个值（从左到右）开始缩减，最终计算为一个值。

``` javascript
    let arr = [1,2,3,4]
    let sum = arr.reduce((pre,cur)=> pre + cur)
    console.log(sum) // 10
```

17. indexOf(),检测当前值在数组中第一次出现的位置索引,参数：array.indexOf(item,start) item:查找的元素 start:字符串中开始检索的位置,返回值：第一次查到的索引，未找到返回-1

``` javascript
    let arr = [1,2,3,4]
    console.log(arr.indexOf(2)) // 1
```

18. includes(),判断一个数组是否包含一个指定的值

``` javascript
    let arr = [1,2,3,4]
    console.log(arr.includes(2)) // true
```

19. Array.from(item)，将具有迭代器的item转化为数组

## 总结
**原数组改变的方法有：push pop shift unshift reverse sort splice**

**不改变原数组的方法有：concat map filter join every some indexOf slice forEach**

# Object.defineProperty 

**=> Vue数据双向绑定原理**

- Object.defineProperty这个方法接收三个参数:
  - 属性所在的对象（Object 对象 => 给谁加）
  - 属性的名字（propName 属性名 => 要加的属性的名字 【类型：String）
  - 一个描述符对象（descriptor 属性描述 => 加的这个属性有什么样的特性【类型：Object）
    - 描述符对象是个什么东西呢？他可以是数据属性：
      - configurable:表示能否通过delete删除属性从而重新定义属性，能否修改属性的特性，或者能否把属性修改为访问器属性，默认值为true。
      - enumerable：表示能否通过for in循环访问属性，默认值为true
      - writable：表示能否修改属性的值。默认值为true。
      - value：包含这个属性的数据值。默认值为undefined。
    - 该方法的第三个参数除了可以是数据属性，也可以是访问器属性。
      - get：在读取属性时调用的函数，默认值是undefined 2..set：在写入属性的时候调用的函数，默认值是undefined现在我们来用这两个方法来实践一下：
       ```javascript
        let book = {
            _year : 2004,
            edition : 1
        }
        Object.defineProperty(book,"year",{
            get: function(){
                return this._year
            },
            set: function(newYear){
                if(newYear > 2004){
                    this._year = newYear;
                    this.edition += newYear - 2004
                }
            }
        })

        book.year = 2005;
        console.log(book.edition); // 2
        console.log(book._year); //2005
       ```
- 最后再说一下如何进行定义多个属性
  ```javascript
    let student = {};
    Object.defineProperties(student,{
        name:{
            writable:false,
            value:"lisi"
        },
        age : {
            writable:true,
            value : 16,
        },
        sex:{
            get(){
                return '男';
            },
            set(v){
                p1.sex = v
            }
        }
    })

    p1.sex = "男";
    console.log(student.name + ":" + student.age);
    console.log(p1.sex); // 男
    student.sex = "女";
    console.log(student.sex); //男
    console.log(p1.sex); // 女
  ```

