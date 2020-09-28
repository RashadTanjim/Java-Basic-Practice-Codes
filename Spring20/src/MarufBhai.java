/*7.a

It s a marker type Interface which is an empty interface.
A marker interface does not contain constants or methods. 
It is used to denote that a class possesses certain desirable properties. 
A class that implements the Cloneable interface is marked cloneable, 
and its objects can be cloned using the clone() method defined in the Object class. 

package java.lang.Object;
public interface Cloneable { 
}

//7.b
Instances of the class property allows the clone(). It will create a shallow copy of the object.

//7.c
The default version of clone() method creates the shallow copy of an object. 
The shallow copy of an object will have exact copy of all the fields of original object. 
If original object has any references to other objects as fields, 
then only references of those objects are copied into clone object, 
copy of those objects are not created. Shallow copy is not 100% disjoint from original object.
Thats why the CloneNotSupportedException occurs and the code is not function intended.


7.d
Public Object clone() throws CloneNotSupportedException{
Car c = (Car) super.clone();
c.tyres = this.tyres;
return c;
} }
*/

