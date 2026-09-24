package com.mbridge.msdk.foundation.p289db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.foundation.same.report.BatchReportMessage;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.util.C13886d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class BatchReportDao extends C13011a<BatchReportMessage> implements Serializable, NoProGuard {
    private static volatile BatchReportDao instance;
    private final Object lock;

    protected BatchReportDao(AbstractC13016f abstractC13016f) {
        super(abstractC13016f);
        this.lock = new Object();
    }

    public static BatchReportDao getInstance(AbstractC13016f abstractC13016f) {
        if (instance == null) {
            synchronized (BatchReportDao.class) {
                if (instance == null) {
                    instance = new BatchReportDao(abstractC13016f);
                }
            }
        }
        return instance;
    }

    public void addReportMessage(String str, int i) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (C13886d.m41426a(writableDatabase)) {
            try {
                synchronized (this.lock) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("report_message", str);
                        contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                        contentValues.put("uuid", UUID.randomUUID().toString().replace("-", ""));
                        contentValues.put("report_state", (Integer) 0);
                        contentValues.put("type", Integer.valueOf(i));
                        writableDatabase.insert("batch_report", null, contentValues);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteBatchReportMessagesByTimestamp(long j) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (C13886d.m41426a(writableDatabase)) {
            try {
                synchronized (this.lock) {
                    writableDatabase.execSQL("delete from batch_report where time <= ?", new Object[]{Long.valueOf(j)});
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<BatchReportMessage> getBatchReportMessages(long j, int i) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        Cursor cursor = null;
        if (!C13886d.m41426a(writableDatabase)) {
            return null;
        }
        ArrayList<BatchReportMessage> arrayList = new ArrayList<>();
        synchronized (this.lock) {
            try {
                try {
                    Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT * FROM batch_report WHERE time <= ? AND report_state = 0 AND type = ? ORDER BY time ASC ", new String[]{String.valueOf(j), String.valueOf(i)});
                    if (cursorRawQuery != null) {
                        while (cursorRawQuery.moveToNext()) {
                            try {
                                arrayList.add(new BatchReportMessage(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uuid")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("report_message")), cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("time"))));
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorRawQuery;
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("report_state", (Integer) 1);
                    writableDatabase.update("batch_report", contentValues, "time <= ?", new String[]{String.valueOf(j)});
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return arrayList;
    }

    public void updateMessagesReportState(ArrayList<BatchReportMessage> arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (arrayList == null || arrayList.size() == 0 || !C13886d.m41426a(writableDatabase)) {
            return;
        }
        for (BatchReportMessage batchReportMessage : arrayList) {
            try {
                synchronized (this.lock) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("report_state", (Integer) 0);
                        writableDatabase.update("batch_report", contentValues, "uuid = ?", new String[]{batchReportMessage.getUuid()});
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static BatchReportDao getInstance(Context context) {
        if (instance == null) {
            synchronized (BatchReportDao.class) {
                if (instance == null) {
                    instance = new BatchReportDao(C13017g.m36693a(context));
                }
            }
        }
        return instance;
    }
}
