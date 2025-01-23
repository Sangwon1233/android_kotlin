package com.sangwon97.imagesider

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sangwon97.imagesider.ui.theme.ImageSiderTheme

class MainActivity : ComponentActivity() {
    private lateinit var addPhotoButton: Button;
    private lateinit var startPhotoButton: Button;
    private lateinit var imageButton: List<ImageView>
    private  val imageList: MutableList<Uri> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addPhotoButton = findViewById(R.id.addPhotoButton)
        startPhotoButton = findViewById(R.id.startPhotoButton)

        imageViewList = listOf(
            findViewById(R.id.imageView),
            findViewById(R.id.imageView),
            findViewById(R.id.imageView)
        )
        addPhotoButton.setOnClickListener {
            navigatePhotos()
        }
        startPhotoButton.setOnClickListener {
            val intent = Intent(this,PhotoFrameActivity::class.java)
            imageList.forEachIndexed { index, uri ->
                intent.putExtra("photo$index",uri.toString())
                startActivity(intent)
            }
        }
        private fun navigatePhotos(){
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            startActivityForResult(intent,500)

        }

        override fun onActivityReenter(requestCode: Int,resultCode: Int, data: Intent?) {
            super.onActivityReenter(requestCode,resultCode, data)
            if(resultCode != Activity.RESULT_OK){
                return
            }
            when (requestCode){
                500 -> {
                    val selectedImageUri :Uri? = data?.data

                    if(selectedImageUri != null){
                        if(imageList.size == 3){
                            Toast.makeText(this , "3장의 사진 선택이 완료되었습니다",
                                Toast.LENGTH_LONG).show()
                            return
                        }
                        imageList.add(selectedImageUri)
                        imageViewList[imageList.size - 1].setImageURI(se-
                        selectedImageUri)
                    }
                }
            }
        }
    }
}
