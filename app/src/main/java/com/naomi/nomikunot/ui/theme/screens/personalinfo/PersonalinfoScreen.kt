package com.naomi.nomikunot.ui.theme.screens.personalinfo


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.naomi.nomikunot.navigation.ROUTE_ROOMINFO


@Composable
fun Personalinfo(navController: NavController) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var contact by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var noofpple by remember { mutableStateOf("") }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.Magenta) ) {
        Text(text = "Personal Information",
            color= Color.Blue,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive )


        OutlinedTextField(value = name, onValueChange = {name = it},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "name") },
            label = { Text(text = "Enter Your Name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )
        OutlinedTextField(value = email, onValueChange = {email = it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email")},
            label = { Text(text = "Enter Your Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )
        OutlinedTextField(value = contact, onValueChange = {contact = it},
            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "contact")},
        label = { Text(text = "Enter Your Contact") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
        keyboardActions = KeyboardActions()
        )

        OutlinedTextField(value = address, onValueChange = {address = it},
            leadingIcon = { Icon(imageVector = Icons.Default.Home, contentDescription = "address")},
        label = { Text(text = "Enter Your Address") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
        keyboardActions = KeyboardActions()
        )
        OutlinedTextField(value = noofpple, onValueChange = {noofpple = it},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "persons")},
        label = { Text(text = "Enter the number of people") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
        keyboardActions = KeyboardActions()
        )





        Button(onClick = { navController.navigate(ROUTE_ROOMINFO) },
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "save", fontSize = 22.sp)

        }



    }


}

@Preview
@Composable
private fun Personinfoprev() {
    Personalinfo(rememberNavController())

}