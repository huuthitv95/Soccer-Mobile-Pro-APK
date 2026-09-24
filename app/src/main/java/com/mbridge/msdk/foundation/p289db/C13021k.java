package com.mbridge.msdk.foundation.p289db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C13219q0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.k */
/* JADX INFO: compiled from: ReplaceTempDao.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13021k extends C13011a {

    /* JADX INFO: renamed from: a */
    private static String f35587a = "ReplaceTempDao";

    /* JADX INFO: renamed from: b */
    private static C13021k f35588b;

    private C13021k(AbstractC13016f abstractC13016f) {
        super(abstractC13016f);
    }

    /* JADX INFO: renamed from: a */
    public static C13021k m36711a(AbstractC13016f abstractC13016f) {
        if (f35588b == null) {
            synchronized (C13015e.class) {
                if (f35588b == null) {
                    f35588b = new C13021k(abstractC13016f);
                }
            }
        }
        return f35588b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r1
  0x0058: PHI (r1v4 org.json.JSONObject) = (r1v0 org.json.JSONObject), (r1v6 org.json.JSONObject) binds: [B:20:0x004c, B:26:0x0056] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public JSONObject m36715b(String str) {
        JSONObject jSONObject = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM c_replace_temp WHERE d_key = ? ", new String[]{str});
        if (cursorRawQuery != null) {
            try {
                if (cursorRawQuery.getCount() > 0) {
                    jSONObject = new JSONObject();
                    while (cursorRawQuery.moveToNext()) {
                        jSONObject = new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("d_value")));
                    }
                } else if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused) {
                    }
                }
                if (cursorRawQuery != null) {
                }
            } catch (Throwable th) {
                try {
                    C13219q0.m37816b(f35587a, th.getMessage());
                } finally {
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        } else {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            if (cursorRawQuery != null) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[Catch: all -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0043, blocks: (B:4:0x0011, B:6:0x0017, B:17:0x0047), top: B:38:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[RETURN] */
    /* JADX INFO: renamed from: d */
    public JSONObject m36716d() {
        JSONObject jSONObject;
        m36712a(7);
        JSONObject jSONObject2 = null;
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM c_replace_temp", null);
        if (cursorRawQuery != null) {
            try {
                if (cursorRawQuery.getCount() > 0) {
                    jSONObject = new JSONObject();
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            jSONObject.put(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("d_key")), new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("d_value"))));
                        } catch (Throwable th) {
                            th = th;
                            try {
                                C13219q0.m37816b(f35587a, th.getMessage());
                                return jSONObject;
                            } finally {
                                if (cursorRawQuery != null) {
                                    try {
                                        cursorRawQuery.close();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                    jSONObject2 = jSONObject;
                } else if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                if (cursorRawQuery != null) {
                    return jSONObject2;
                }
                jSONObject = jSONObject2;
            } catch (Throwable th2) {
                JSONObject jSONObject3 = jSONObject2;
                th = th2;
                jSONObject = jSONObject3;
            }
        } else {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            if (cursorRawQuery != null) {
                return jSONObject2;
            }
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m36713a(String str, JSONObject jSONObject) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("d_key", str);
            contentValues.put("d_value", jSONObject.toString());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            if (!m36714a(str)) {
                getWritableDatabase().insert("c_replace_temp", null, contentValues);
            } else {
                getWritableDatabase().update("c_replace_temp", contentValues, "d_key = ? ", new String[]{str});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m36714a(String str) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT d_value FROM c_replace_temp WHERE d_key= ? ", new String[]{str});
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
        if (cursorRawQuery == null) {
            return false;
        }
        try {
            cursorRawQuery.close();
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36712a(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (i * 86400000));
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete("c_replace_temp", "time<?", new String[]{String.valueOf(jCurrentTimeMillis)});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
