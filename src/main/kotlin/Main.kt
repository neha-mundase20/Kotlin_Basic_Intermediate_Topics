import java.security.KeyStore.TrustedCertificateEntry

//TYPE CHECKS (use 'is' and '!is' operator to check whether it conforms to a specific type)

//fun main(){
//    val a = "Mumbai"
//    if(a is String){
//        println("$a is a string")
//        println(a.length)
//    }
//
//    val b = 10
//    if(b is Int){
//        println("$b is an Integer")
//    }
//
//    Demo("Pune")
//    Demo(10)
//}
//
//fun Demo(x:Any){
//    if(x is String){
//        println(x.length)
//    }
//
//    if (x !is String) return
//
//    print(x.length) // x is automatically cast to String
//}


//UNSAFE CAST
//fun main(){
//    val a: Any? =null
//    val str:String? =a as String?
//    println(str)
//}

//SAFE CAST
//fun main(){
//    val a:String = "Kotlin"
//    val b: Int? = a as? Int
//    println(b)
//}

//fun main(){
//    var a:Int=0
//    for(a in 0..6){
//        if(a==3){
//            break
//        }
//        else{
//            println(a++)
//        }
//    }
//
//    while(a<=6){
//        if(a==3){
//            continue
//        }
//        println(a)
//        a++
//    }
//}

//import java.util.Scanner
//
//fun main(){
//    println("Enter any number from 1-5:")
//    //val a:Int= readLine()!!.toInt()
//    val sc = Scanner(System.`in`)
//    val a:Int=sc.nextInt()
//
//    when(a){
//        1-> println(1)
//        2-> println(4)
//        3-> println(9)
//        4-> println(16)
//        5-> println(25)
//        else->println("Invalid Number")
//    }
//}


//COLLECTIONS AND MAPS
//fun PrintList(stringlist:Collection<String>){
//    for (s in stringlist){
//        println(s)
//    }
//}
//
//
//fun main(){
//    val stringlist = listOf<String>("Neha","Nandini","Varsha","Ravindra")
//    println(stringlist)
//    PrintList(stringlist)
//}

//fun operations(colors:Collection<String>){
//    for(s in colors){
//        println(s)
//    }
//}
//
//
//fun main(){
//    val colors = mutableListOf<String>("Red","Blue","Yellow","Pink","Green")
//    println(colors)
//    colors.add("Lavender")
//    colors.add(0,"White")
//    println(colors)
//    colors.removeAt(3)
//    colors.remove("Pink")
//    println(colors)
//    operations(colors)
//}


//'for' loop has auto increment
//we can add labels as name folowed by '@' symbol
//fun sub(){
//    loop@ for (i in 0..6){
//        if(i==3) return   //returns to the main function
//        println(i)
//    }

//    listOf<Int>(0,1,2,3,4,5,6).forEach()lit@{
//        if(it==3)return@lit  //returns to the label above lit@ i.e.skips 3 and starts again
     //use of explicit label
//        println(it)
//    }
//     println("Done with explicit label")

//     listOf<Int>(1,2,3,4,5,6).forEach(){
//          if(it == 3)return@forEach  //use of implicit label
//          println(it)
//     }
//     println("Done with implicit label")
//}

fun main(){
//   val colors = mutableListOf<String>("Blue","Lavender","Peach")
//   println(colors)
//   for(it in colors){
//      println(it)
//   }
//   colors.shuffle()
//   println(colors)
//   for(it in colors){
//      println(it)
//   }


//   val set1 = setOf<Int>(1,2,3,4)
//   val set2 = setOf<Int>(4,4,4,4,3,2,1)  //if duplicate elements are present it will consider
//   //only single element
//
//   if(set1==set2){
//      println("Both sets are equal")
//   }

//   val numbersMap = mutableMapOf<String,Int>("Key1" to 1,"Key2" to 2,"Key3" to 3)
//   println(numbersMap)
//   for (it in numbersMap){
//      println(it.key)
//      println(it.value)
//   }
//   numbersMap.put("Key4",4)
//   println(numbersMap)


   //instead of always using the infix 'to' to concatenate key value pair, use apply()
//   val numbersMap = mutableMapOf<String,Int>().apply { this["key1"]=1 ; this["key2"]=2 ; this["key3"]=3 }
//   println(numbersMap)
//   numbersMap.forEach(){
//      println(it.key)
//      println(it.value)
//   }


   //use build functions to create mutable lists, sets and maps
//   val numbersMap = buildMap<String,String> { put("name1","Neha");put("name2","Nandini") }
//   println(numbersMap)
//   numbersMap.forEach(){
//      println(numbersMap.keys)
//      println(numbersMap.values)
//
//      println(it.key)
//      println(it.value)
//   }

//   val setColors = buildSet<String> {
//      add("Lavender")
//      add("Blue")
//      add("Neha")
//   }
//   println(setColors)
//   setColors.forEach(){
//      println(it)
//   }


   //Initializer functions for lists
   //For lists, there is a constructor-like function that takes the list size
   //and the initializer function that defines the element value based on its index.

   //To create same collections as that of created before, use collection copying functions.
   //A change made in copy will reflect across all copies

   val colors1 = mutableListOf<String>()
   colors1.add(0,"Lavender")
   colors1.add(1,"Blue")
   colors1.forEach(){
      println(it)
   }

   val colors2=colors1.toList()
   colors2.forEach(){
      println(it)
   }
   colors1.add("Peach")
   println(colors1)
   println(colors2)


}
