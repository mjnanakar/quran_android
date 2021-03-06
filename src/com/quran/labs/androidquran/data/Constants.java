package com.quran.labs.androidquran.data;

public class Constants {
   // Numerics
   public static final int DEFAULT_TEXT_SIZE = 15;

   // Pages
   public static final int PAGES_FIRST = 1;
   public static final int PAGES_LAST = 604;
   public static final int SURA_FIRST = 1;
   public static final int SURA_LAST = 114;
   public static final int SURAS_COUNT = 114;
   public static final int JUZ2_COUNT = 30;
   public static final int AYA_MIN = 1;
   public static final int AYA_MAX = 286;
   public static final int NO_PAGE_SAVED = -1;

   // Settings Key
   public static final String PREF_USE_ARABIC_NAMES = "useArabicNames";
   public static final String PREF_LAST_PAGE = "lastPage";
   public static final String PREF_LOCK_ORIENTATION = "lockOrientation";
   public static final String PREF_LANDSCAPE_ORIENTATION = "landscapeOrientation";
   public static final String PREF_TRANSLATION_TEXT_SIZE = "translationTextSize";
   public static final String PREF_ACTIVE_TRANSLATION = "activeTranslation";
   public static final String PREF_RESHAPE_ARABIC = "reshapeArabic";
   public static final String PREF_NIGHT_MODE = "nightMode";
   public static final String PREF_DEFAULT_QARI = "defaultQari";
   public static final String PREF_SHOULD_FETCH_PAGES ="shouldFetchPages";
   public static final String PREF_DISPLAY_MARKER_POPUP = "displayMarkerPopup";
   public static final String PREF_AYAH_BEFORE_TRANSLATION = "ayahBeforeTranslation";
   public static final String PREF_PREFER_STREAMING = "preferStreaming";
   public static final String PREF_DOWNLOAD_AMOUNT = "preferredDownloadAmount";
}
