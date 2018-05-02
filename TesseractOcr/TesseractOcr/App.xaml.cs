using System;
using Tesseract;
using TesseractOcr.Views;
using Xamarin.Forms;

namespace TesseractOcr
{
	public partial class App : Application
	{
		public static ITesseractApi Tesseract;

		public App ()
		{
			InitializeComponent();


            MainPage = new MainPage();
        }

		protected override void OnStart ()
		{
			// Handle when your app starts
		}

		protected override void OnSleep ()
		{
			// Handle when your app sleeps
		}

		protected override void OnResume ()
		{
			// Handle when your app resumes
		}
	}
}
