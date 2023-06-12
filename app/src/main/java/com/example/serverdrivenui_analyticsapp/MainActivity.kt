package com.example.serverdrivenui_analyticsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.serverdrivenui_analyticsapp.ui.components.ComponentsScreen
import com.example.serverdrivenui_analyticsapp.ui.components.ComponentsViewModel
import com.example.serverdrivenui_analyticsapp.ui.dashboards.DashboardScreen
import com.example.serverdrivenui_analyticsapp.ui.dashboards.DashboardsViewModel
import com.example.serverdrivenui_analyticsapp.ui.detailed.ComponentDetailScreen
import com.example.serverdrivenui_analyticsapp.ui.detailed.ComponentDetailedViewModel
import com.example.serverdrivenui_analyticsapp.ui.theme.ServerDriveUiAnalyticsAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ServerDriveUiAnalyticsAppTheme {
                StartApplication()
            }
        }
    }
}

@Composable
fun StartApplication() {
    val navController = rememberNavController()

    val dashboardsViewModel: DashboardsViewModel = viewModel()
    dashboardsViewModel.getDashboards()
    dashboardsViewModel.getViewStructure()

    val componentsViewModel: ComponentsViewModel = viewModel()
    componentsViewModel.getComponents()
    componentsViewModel.getViewStructure()

    val componentDashboardsViewModel: ComponentDetailedViewModel = viewModel()
    componentDashboardsViewModel.getViewStructure()

    NavHost(navController = navController,
        startDestination = ApplicationScreens.DASHBOARD.name) {
        composable(ApplicationScreens.DASHBOARD.name) {
            DashboardScreen(dashboardsViewModel.dashboards, dashboardsViewModel.structure)
        }

        composable(ApplicationScreens.COMPONENTS.name) {
            ComponentsScreen(componentsViewModel.components, componentsViewModel.structure)
        }

        composable(ApplicationScreens.COMPONENT_DETAIL.name) {
            ComponentDetailScreen(componentDashboardsViewModel.structure)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ServerDriveUiAnalyticsAppTheme {
        StartApplication()
    }
}