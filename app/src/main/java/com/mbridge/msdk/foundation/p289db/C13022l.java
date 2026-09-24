package com.mbridge.msdk.foundation.p289db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.C13074h;
import com.mbridge.msdk.foundation.entity.C13075i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.l */
/* JADX INFO: compiled from: UnitIDDao.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13022l extends C13011a<C13074h> {

    /* JADX INFO: renamed from: a */
    private static C13022l f35589a;

    private C13022l(AbstractC13016f abstractC13016f) {
        super(abstractC13016f);
    }

    /* JADX INFO: renamed from: a */
    public static C13022l m36717a(AbstractC13016f abstractC13016f) {
        if (f35589a == null) {
            synchronized (C13022l.class) {
                if (f35589a == null) {
                    f35589a = new C13022l(abstractC13016f);
                }
            }
        }
        return f35589a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m36719a(String str) {
        if (getWritableDatabase() != null) {
            getWritableDatabase().delete(MBridgeConstans.PROPERTIES_UNIT_ID, "unitId = ?", new String[]{str + ""});
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m36720a(String str, String str2, int i) {
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("placement_id", str);
        contentValues.put("unitId", str2);
        contentValues.put("ad_type", Integer.valueOf(i));
        getWritableDatabase().insert(MBridgeConstans.PROPERTIES_UNIT_ID, null, contentValues);
    }

    /* JADX INFO: renamed from: a */
    public synchronized List<C13075i> m36718a(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursor = null;
        arrayList2 = null;
        arrayList2 = null;
        cursor = null;
        try {
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("select * from unit_id WHERE ad_type = ?", new String[]{String.valueOf(i)});
                    if (cursorRawQuery != null) {
                        try {
                            try {
                                if (cursorRawQuery.getCount() > 0) {
                                    arrayList = new ArrayList(cursorRawQuery.getCount());
                                    while (cursorRawQuery.moveToNext()) {
                                        try {
                                            arrayList.add(new C13075i(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("placement_id")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("unitId")), i));
                                        } catch (Exception e) {
                                            e = e;
                                            cursor = cursorRawQuery;
                                            e.printStackTrace();
                                            if (cursor != null) {
                                                cursorRawQuery = cursor;
                                                arrayList2 = arrayList;
                                                try {
                                                    cursorRawQuery.close();
                                                } catch (Exception unused) {
                                                }
                                            } else {
                                                arrayList2 = arrayList;
                                            }
                                        }
                                    }
                                    arrayList2 = arrayList;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                arrayList = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
                arrayList = null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return arrayList2;
    }
}
