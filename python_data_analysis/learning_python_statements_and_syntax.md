## Python Conceptual Hierachy
Python 프로그램의 계층구조. 

Python 프로그램은 구문과 표현식으로 이루어져 있다. 표현식은 구문에 포함되며, 구문은 모듈을 구성하며 프로그램 작동의 더 큰 논리를 코딩한다. 나아가, 구문은 객체가 존재하는 곳이고, 함수, 클래스를 생성한다.

```python
# Python Conceptual Hierachy
# ├── Program
# │   ├── Module
# │   │   ├── Statement
# │   │   ├── Statement
# │   │   │   └── Expression
# │   │   │       ├── Object
# │   │   │       ├── Object
# │   │   │       └── Object
# │   │   └── Statement
# │   ├── Module
# │   └── Module
# ...
```

## Python’s Statements
- Python 구문 예
<table>
   <tr>
      <th>Statement</th> <th>Role</th> <th>Example</th>
   </tr>
   <tr>
      <td>Assignment</td> <td>Creating references</td>
      <td>
      <code>a, b = 'good', 'bad'</code>
      </td>
   </tr>
   <tr>
      <td>Calls and other expressions</td> <td>Running functions</td>
      <td>
      <code>log.write("spam, ham")</code>
      </td>
   </tr>
   <tr>
      <td>print calls</td> <td>Printing objects</td>
      <td>
      <code>print('The Killer', joke)</code>
      </td>
   </tr>
   <tr>
      <td>if/elif/else</td> <td>Selecting actions</td>
      <td>
      <pre><code>if "python" in text:
   print(text)</code></pre>
   </td>
   </tr>
   <tr>
      <td>for/else</td> <td>Iteration</td>
      <td>
         <pre><code>for x in mylist:
   print(x)</code></pre>
      </td>
   </tr>
   <tr>
      <td>while/else</td> <td>General loops</td>
      <td>
         <pre><code>while X > Y:
    print('hello')</code></pre>
      </td>
   </tr>
   <tr>
      <td>pass</td> <td>Empty placeholder</td>
      <td>
         <pre><code>while True:
    pass</code></pre>
      </td>
   </tr>
   <tr>
      <td>break</td> <td>Loop exit</td>
      <td>
         <pre><code>while True:
    if exittest(): break</code></pre>
      </td>
   </tr>
   <tr>
      <td>Loop continue</td> <td>Loop exit</td>
      <td>
         <pre><code>wwhile True:
    if skiptest(): continue</code></pre>
      </td>
   </tr>
   <tr>
      <td>def</td> <td>Functions and methods</td>
      <td>
         <pre><code>def f(a, b, c=1, *d):
    print(a+b+c+d[0])</code></pre>
      </td>
   </tr>
   <tr>
      <td>return</td> <td>Functions results</td>
      <td>
         <pre><code>def f(a, b, c=1, *d): 
    return a+b+c+d[0]</code></pre>
      </td>
   </tr>
   <tr>
      <td>yield</td> <td>Generator functions</td>
      <td>
         <pre><code>def gen(n):
    for i in n: yield i*2</code></pre>
      </td>
   </tr>
   <tr>
      <td>global</td> <td>Namespaces</td>
      <td>
         <pre><code>x = 'old'
def function():
    global x, y; x = 'new'</code></pre>
      </td>
   </tr>
   <tr>
      <td>nonlocal</td> <td>Namespaces (3.X)</td>
      <td>
         <pre><code>def outer():
    x = 'old'
    def function(): 
        nonlocal x; x = 'new'</code></pre>
</td>
   </tr>
   <tr>
      <td>import</td> <td>Module access</td>
      <td>
         <code>import sys</code>
      </td>
   </tr>
   <tr>
      <td>from</td> <td>Attribute access</td>
      <td>
         <code>from sys import stdin</code>
      </td>
   </tr>
   <tr>
      <td>class</td> <td>Building objects</td>
      <td>
         <pre><code>class Subclass(Superclass):
    staticData = []
    def method(self): pass</code></pre>
      </td>
   </tr>
   <tr>
      <td>try/except/finally</td> <td>Catching exceptions</td>
      <td>
         <pre><code>try:
    action() 
except:
    print('action error')</code></pre>
      </td>
   </tr>
   <tr>
      <td>raise</td> <td>Triggering exceptions</td>
      <td>
         <code>raise EndSearch(location)</code>
      </td>
   </tr>
   <tr>
      <td>assert</td> <td>Debugging checks</td>
      <td>
         <code>assert X > Y, 'X too small'</code>
      </td>
   </tr>
   <tr>
      <td>with/as</td> <td>Context managers (3.X, 2.6+)</td>
      <td>
         <pre><code>with open('data') as myfile:
    process(myfile)</code></pre>
      </td>
   </tr>
   <tr>
      <td>del</td> <td>Deleting references</td>
      <td>
         <code>del data[k]</code><br />
         <code>del data[i:j]</code><br />
         <code>del obj.attr</code><br />
         <code>del variable</code>
      </td>
   </tr>
</table>

## Indentation Syntax
## Quick Example : Interactive Loops
### Simple Interactive Loop

# Assignment Statements
Python에서 할당 구문은 자료형을 선언하지 않아도 되기 때문에 간단하지만, 기억해야 할 몇 가지 속성이 있다.
- Python에서 할당이란 객체를 저장하는 것이 아니라, 객체 참조를 만드는 것이다.
- 변수 역시 처음 할당되는 시점에 만들어진다.
- 따라서 변수를 할당하기 전에는 사용할 수 없다. 참조가 없는 변수에 접근하는 것은 에러를 출력할 수 있기 때문에 기본값을 설정하는 것이 좋다.
- Python에서 일부는 암시적으로 값을 할당한다. 예를 들어 모듈 가져오기, 루프 변수 등 `=`외에도 암시적으로 할당이 이루어진다.