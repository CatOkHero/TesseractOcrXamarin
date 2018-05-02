using Plugin.Media;
using System;
using System.Windows.Input;
using TesseractOcr.Models;
using Xamarin.Forms;

namespace TesseractOcr.ViewModels
{
	public class ItemDetailViewModel : BaseViewModel
	{
		private string tesseractText;
		public Item Item { get; set; }
		public ItemDetailViewModel(Item item = null)
		{
			Title = item?.Text;
			Item = item;
		}

		public string TesseractText { get => tesseractText; set => SetProperty(ref tesseractText, value); }

		public ICommand TesseractTranslate => new Command(async () =>
		{
			var initialized = await App.Tesseract.Init(Item.Parameter, Tesseract.OcrEngineMode.TesseractOnly);
			if (!initialized)
			{
				return;
			}

			await CrossMedia.Current.Initialize();

			if (!CrossMedia.Current.IsCameraAvailable || !CrossMedia.Current.IsTakePhotoSupported)
			{
				return;
			}

			var file = await CrossMedia.Current.PickPhotoAsync();
			if (file == null)
				return;

			var result = await App.Tesseract.SetImage(file.GetStreamWithImageRotatedForExternalStorage());
			
			TesseractText = App.Tesseract.Text;
		});
	}
}
