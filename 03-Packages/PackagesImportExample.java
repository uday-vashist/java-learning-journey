// File: PackageImportExample.java
// Topic: Importing user-defined package

import mypackage.Message;

public class PackageImportExample {

    public static void main(String[] args) {

        Message obj = new Message();
        obj.showMessage();
    }
}


/*
--------------------------------------------------
Important Points About Importing Packages
--------------------------------------------------

1. 'import' keyword is used to access classes
   from another package.

2. Syntax:
   import package_name.ClassName;

3. You can also import all classes:
   import package_name.*;

4. Public classes are accessible outside package.

5. Packages help in modular programming.

--------------------------------------------------
Compilation & Execution (Important)
--------------------------------------------------

Step 1:
javac -d . Message.java

Step 2:
javac PackageImportExample.java

Step 3:
java PackageImportExample
*/
