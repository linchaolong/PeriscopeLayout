# PeriscopeLayout
A layout with animation like Periscope's

一个类似Periscope点赞效果的Layout,效果如下:  

![效果图](img/periscope.gif)  

对应的实现文章在这里:[一步一步教你实现Periscope点赞效果
](http://www.jianshu.com/p/03fdcfd3ae9c)

## Add dependency

### Gradle
`compile 'me.yifeiyuan.periscopelayout:library:1.0.0'`

### Maven
```
<dependency>
<groupId>me.yifeiyuan</groupId>
<artifactId>periscopelayout</artifactId>
<version>library</version>
<type>xml</type>
</dependency>
```

### Eclipse
呵呵

## Usage

在 layout 中添加 PeriscopeLayout
```
<me.yifeiyuan.library.PeriscopeLayout
      android:id="@+id/periscope"
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      app:plDrawables="@array/drawables"/>
```

支持自定义动画的图形
```
  <integer-array name="drawables" >
    <item>@drawable/praise_01</item>
    <item>@drawable/praise_02</item>
    <item>@drawable/praise_03</item>
    <item>@drawable/praise_04</item>
  </integer-array>
```

在代码中通过调用 addOne 方法添加一个动画，`addOne(int index)` 支持通过索引指定动画使用哪个图形，默认随机选择一个图形。
```
periscopeLayout.addOne();
```

## Contributors

[junyuecao](https://github.com/junyuecao)

## License
	Copyright (C) 2015, 程序亦非猿
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	  http://www.apache.org/licenses/LICENSE-2.0
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
