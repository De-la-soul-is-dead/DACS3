package com.example.joomina

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.joomina.controller.model.ShareViewModel
import com.example.joomina.data.Account

@Composable
fun TestScreen(shareViewModel: ShareViewModel) {
    var id by remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        var list by remember {
            mutableStateOf(emptyList<Account>())
        }

        var account by remember {
            mutableStateOf(Account())
        }

        shareViewModel.getAllAccount(
            listAccount =  {
                list = it
            }
        )

        list.forEach {
            if (it.id == 1) {
                id = it.userName
            }
        }

        list.forEach {
            if(it.id == 4) {
                account = it
            }
        }
        
        Text(text = account.userName)
    }
}