    package com.sangwon97.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sangwon97.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.view)
        
//        val fruits = listOf("파인애플","사과","바나나","복숭아","포토","구아바","망고","멜론","파인애플","사과","바나나","복숭아","포토","구아바","망고","멜론")
//        val listView:ListView=findViewById(R.id.listView)
//
//        //adapter
//        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,fruits)
//        listView.adapter = adapter;
//
//        listView.setOnItemClickListener { , , position, _ ->
//            // position = index
//            val value = fruits[position];
//            Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
//        }

        // event
//        val input:EditText = findViewById(R.id.editTextText)
//        val button:Button = findViewById(R.id.button)
//
//        button.setOnClickListener {
//            val textvalue = input.text.toString();
//            if(textvalue.isBlank()) {
//                Toast.makeText(this, "값을 입력하세요", Toast.LENGTH_SHORT).show()
//            }
//            else{
//                Toast.makeText(this, "안녕하세요 $textvalue", Toast.LENGTH_SHORT).show()
//            }
//        }


//        enableEdgeToEdge()
//        setContent {
//            MyApplicationTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "World",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}