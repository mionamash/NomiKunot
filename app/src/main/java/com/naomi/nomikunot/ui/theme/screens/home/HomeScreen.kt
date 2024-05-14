package com.naomi.nomikunot.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.naomi.nomikunot.R
import com.naomi.nomikunot.navigation.ROUTE_PERSONINFO




@Composable
fun MyListcustom(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        items(roomsList) { model ->
            ListColumn(model = model)
        }
    }
    
    Button(onClick = { navController.navigate(ROUTE_PERSONINFO) }) {
        Text(text = "Book Room")
        
    }

    Text(text = "Welcome To NomiKunot",
        color= Color.Blue,
        fontSize = 30.sp,
        fontFamily = FontFamily.Cursive )


}
data class RoomModel(val image: Int, val room:String, val explain:String,)

@Composable
fun ListColumn(model: RoomModel) {
  
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,

        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color.Magenta)
    ) {
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
        )
        Text(
            text = model.room,
            fontSize = 31.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.LightGray,
            fontFamily = FontFamily.Cursive
        )
        Text(
            text = model.explain,
            fontSize = 20.sp,

            color = Color.Black,
            fontFamily = FontFamily.SansSerif,


            )

    }
}
private val roomsList = mutableListOf<RoomModel>().apply {

    add(RoomModel( R.drawable.oneb,"Single Bed-room","A room with a single bed more space and privacy"))
    

    
    add(RoomModel( R.drawable.twob2,"Double Bed-room","An affordable room for you,has two comfy beds near large windows and a better view."))
   
    add(RoomModel( R.drawable.dlux,"Deluxe Bed-room","A bigger room for you with a bathtub and shower."))
   
    add(RoomModel( R.drawable.sup,"Super-deluxe Bed-room","More comfortable room for you with more space,inclusive of a bathtub and shower and more lighting."))

}




//@Composable
//fun MyListcustom(navController: NavHostController) {
//    LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White)
//    ) {
//        items(roomsList) { model ->
//            ListColumn(model = model)
//        }
//    }
//
//    Text(text = "Welcome To NomiKunot",
//        color= Color.Blue,
//        fontSize = 30.sp,
//        fontFamily = FontFamily.Cursive )
//
//
//}





@Preview
@Composable
private fun Customprev() {
    MyListcustom(navController = rememberNavController())
}