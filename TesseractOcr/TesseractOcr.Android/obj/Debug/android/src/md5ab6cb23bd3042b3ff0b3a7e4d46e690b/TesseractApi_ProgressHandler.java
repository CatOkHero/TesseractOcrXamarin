package md5ab6cb23bd3042b3ff0b3a7e4d46e690b;


public class TesseractApi_ProgressHandler
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.googlecode.tesseract.android.TessBaseAPI.ProgressNotifier
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProgressValues:(Lcom/googlecode/tesseract/android/TessBaseAPI$ProgressValues;)V:GetOnProgressValues_Lcom_googlecode_tesseract_android_TessBaseAPI_ProgressValues_Handler:Com.Googlecode.Tesseract.Android.TessBaseAPI/IProgressNotifierInvoker, Tesseract.Binding.Droid\n" +
			"";
		mono.android.Runtime.register ("Tesseract.Droid.TesseractApi+ProgressHandler, Tesseract.Droid, Version=0.3.4.0, Culture=neutral, PublicKeyToken=null", TesseractApi_ProgressHandler.class, __md_methods);
	}


	public TesseractApi_ProgressHandler ()
	{
		super ();
		if (getClass () == TesseractApi_ProgressHandler.class)
			mono.android.TypeManager.Activate ("Tesseract.Droid.TesseractApi+ProgressHandler, Tesseract.Droid, Version=0.3.4.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onProgressValues (com.googlecode.tesseract.android.TessBaseAPI.ProgressValues p0)
	{
		n_onProgressValues (p0);
	}

	private native void n_onProgressValues (com.googlecode.tesseract.android.TessBaseAPI.ProgressValues p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
