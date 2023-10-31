## Problem Statement: Write unit test cases for the given solution ##

**This exercise should be completed by writing unit test cases for the solution provided**


- Below is the summary of the solution provided

- This exercise contains a Generic class named GenericMapOperations that extends LinkedHashMap with the following methods :

           +removeEldestEntry(java.util.Map.Entry<K, V> eldest)
            -Remove the eldest element whenever size of map exceeds the capacity and return boolean
           +V find(K key)
             -Returns the value corresponding to input key from the Map.
           +set(K key, V value)
              -Set the element with input key and value in the map. If the element
                    already exits, it updates its value
           
- Create class GenericMapOperationsTests in package com.stackroute.genericcollection 
 
    - write the unit tests for testing set,find,remove the eldest element for Integer and String type elements
- Some of the test cases are mentioned below

    - set method called with key and values  of String and Integer type    
    - set method called with elements more than initial capacity
    - find method called with key of String type and Integer type
    - Constructor called with negative capacity should throw IllegalArgumentException
    - Null and empty values passed to set method should throw NullPointerException
    
 Note:Any other specific types can be tested as the class is Generic type.But currently the code is tested with <Integer,Integer> ,<String,String>    

- Minimum test cases expected : 11


- Test cases should be written for positive, negative and boundary scenarios, wherever applicable


- Test coverage should be 100%



## Instructions

- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding

## Code coverage 

 - Run mvn test, the JaCoCo code coverage report will be generated at target/site/jacoco/*
 - Open the target/site/jacoco/index.html file, review the code coverage report 
 
            - Green – Code is tested or covered.
            - Red – Code is not tested or covered.
            - Yellow – Code is partially tested or covered.
 - Make sure lines coverage must meet the minimum 90%