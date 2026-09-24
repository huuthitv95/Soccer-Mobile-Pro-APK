package com.mbridge.msdk.tracker;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.y */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes7.dex */
class C13882y {
    /* JADX INFO: renamed from: a */
    public static long m41411a(int i, long j, long j2) {
        if (i <= 0 || j == 0 || i <= 10) {
            return j2;
        }
        if (i <= 20) {
            return 60000L;
        }
        if (i <= 30) {
            return UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        }
        if (i <= 40) {
            return 180000L;
        }
        return i <= 50 ? 240000L : 300000L;
    }

    /* JADX INFO: renamed from: a */
    static void m41412a(Cursor cursor) {
        try {
            if (!m41414a((Object) cursor) || cursor.isClosed()) {
                return;
            }
            cursor.close();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m41413a(C13818e c13818e) {
        return m41414a((Object) c13818e) && c13818e.m41013h() == 1;
    }

    /* JADX INFO: renamed from: a */
    static boolean m41414a(Object obj) {
        return obj != null;
    }

    /* JADX INFO: renamed from: a */
    static boolean m41415a(List<C13822i> list) {
        if (m41418b((List<?>) list)) {
            return false;
        }
        for (C13822i c13822i : list) {
            if (!m41417b(c13822i)) {
                C13818e c13818eM41031d = c13822i.m41031d();
                if (!m41417b(c13818eM41031d) && c13818eM41031d.m41013h() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX INFO: renamed from: b */
    static List<C13822i> m41416b(Cursor cursor) {
        int i;
        int i2;
        int i3;
        Cursor cursor2 = cursor;
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = cursor2.getColumnIndex("name");
            int columnIndex2 = cursor2.getColumnIndex("type");
            int columnIndex3 = cursor2.getColumnIndex("time_stamp");
            int columnIndex4 = cursor2.getColumnIndex("properties");
            int columnIndex5 = cursor2.getColumnIndex(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            int columnIndex6 = cursor2.getColumnIndex("uuid");
            int columnIndex7 = cursor2.getColumnIndex("duration");
            int columnIndex8 = cursor2.getColumnIndex("state");
            int columnIndex9 = cursor2.getColumnIndex("report_count");
            int columnIndex10 = cursor2.getColumnIndex("ignore_max_timeout");
            int columnIndex11 = cursor2.getColumnIndex("ignore_max_retry_times");
            int columnIndex12 = cursor2.getColumnIndex("invalid_time");
            int columnIndex13 = cursor2.getColumnIndex("report_error_message");
            while (cursor2.moveToNext()) {
                try {
                    i = columnIndex;
                    try {
                        C13818e c13818e = new C13818e(cursor2.getString(columnIndex));
                        c13818e.m41008b(cursor2.getInt(columnIndex2));
                        int i4 = columnIndex12;
                        int i5 = columnIndex13;
                        try {
                            c13818e.m41010c(cursor2.getLong(columnIndex3));
                            c13818e.m41006a(new JSONObject(cursor2.getString(columnIndex4)));
                            c13818e.m41002a(cursor2.getInt(columnIndex5));
                            c13818e.m41005a(cursor2.getString(columnIndex6));
                            c13818e.m41003a(cursor2.getLong(columnIndex7));
                            C13822i c13822i = new C13822i(c13818e);
                            c13822i.m41029b(cursor2.getInt(columnIndex8));
                            c13822i.m41025a(cursor2.getInt(columnIndex9));
                            boolean z = true;
                            c13822i.m41030b(cursor2.getInt(columnIndex10) == 0);
                            if (cursor2.getInt(columnIndex11) != 0) {
                                z = false;
                            }
                            c13822i.m41028a(z);
                            i2 = i4;
                            try {
                                c13822i.m41026a(cursor2.getLong(i2));
                                i3 = i5;
                                try {
                                    String string = cursor2.getString(i3);
                                    if (TextUtils.isEmpty(string)) {
                                        string = "";
                                    }
                                    c13822i.m41027a(string);
                                    arrayList.add(c13822i);
                                } catch (JSONException e) {
                                    e = e;
                                    if (C13814a.f39370a) {
                                        Log.e("TrackManager", "create: ", e);
                                    }
                                    cursor2 = cursor;
                                }
                            } catch (JSONException e2) {
                                e = e2;
                                i3 = i5;
                                if (C13814a.f39370a) {
                                    Log.e("TrackManager", "create: ", e);
                                }
                                cursor2 = cursor;
                                columnIndex13 = i3;
                                columnIndex12 = i2;
                                columnIndex = i;
                            }
                        } catch (JSONException e3) {
                            e = e3;
                            i2 = i4;
                        }
                    } catch (JSONException e4) {
                        e = e4;
                        i2 = columnIndex12;
                        i3 = columnIndex13;
                        if (C13814a.f39370a) {
                            Log.e("TrackManager", "create: ", e);
                        }
                        cursor2 = cursor;
                        columnIndex13 = i3;
                        columnIndex12 = i2;
                        columnIndex = i;
                    }
                } catch (JSONException e5) {
                    e = e5;
                    i = columnIndex;
                }
                columnIndex13 = i3;
                columnIndex12 = i2;
                columnIndex = i;
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    static boolean m41417b(Object obj) {
        return obj == null;
    }

    /* JADX INFO: renamed from: b */
    static boolean m41418b(List<?> list) {
        return list == null || list.isEmpty();
    }
}
