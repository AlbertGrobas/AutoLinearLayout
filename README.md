AutoLinearLayout
===============

Custom layout that arranges views in rows and columns automatically.
Takes care about padding, margins, gravity and layout child gravities.


![Demo Screenshot 1][1]
![Demo Screenshot 2][2]


Usage
-----

To use AutoLinearLayout, add the module into your project and start to build xml or java.

###XML
```xml
    <net.grobas.widget.AutoLinearLayout 
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:auto_gravity="center"
        app:auto_orientation="vertical">
        <!-- other views -->
    </net.grobas.widget.AutoLinearLayout>
```

#####Properties:

* `app:auto_orientation` (int)    -> default horizontal
* `app:auto_gravity`  (flag)      -> default top | left


###JAVA

```java
    AutoLinearLayout l2 = new AutoLinearLayout(this);
    l2.setOrientation(AutoLinearLayout.VERTICAL);
    l2.setGravity(Gravity.CENTER);
    //add other views
    parent.addView(l2);
```

##TODO

* Rtl
* Dividers?

License
-------

    Copyright 2014 Albert Grobas

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



[1]: ./art/screen01.png
[2]: ./art/screen02.png
