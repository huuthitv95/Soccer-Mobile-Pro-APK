package com.google.android.exoplayer2.p281ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.core.C9460R;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final NotificationCompat.Builder notificationBuilder;

    private static final class Api31 {
        private Api31() {
        }

        public static void setForegroundServiceBehavior(NotificationCompat.Builder builder) {
            builder.setForegroundServiceBehavior(1);
        }
    }

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new NotificationCompat.Builder(context.getApplicationContext(), str);
    }

    private Notification buildEndStateNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2) {
        return buildNotification(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.notificationBuilder.setSmallIcon(i);
        this.notificationBuilder.setContentTitle(i2 == 0 ? null : context.getResources().getString(i2));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new NotificationCompat.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i3, i4, z);
        this.notificationBuilder.setOngoing(z2);
        this.notificationBuilder.setShowWhen(z3);
        if (Util.SDK_INT >= 31) {
            Api31.setForegroundServiceBehavior(this.notificationBuilder);
        }
        return this.notificationBuilder.build();
    }

    public Notification buildDownloadCompletedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, C9460R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, C9460R.string.exo_download_failed);
    }

    @Deprecated
    public Notification buildProgressNotification(Context context, int i, PendingIntent pendingIntent, String str, List<Download> list) {
        return buildProgressNotification(context, i, pendingIntent, str, list, 0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    public Notification buildProgressNotification(Context context, int i, PendingIntent pendingIntent, String str, List<Download> list, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        float percentDownloaded;
        boolean z3;
        float f = 0.0f;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i7 = 0;
        boolean z9 = true;
        for (int i8 = 0; i8 < list.size(); i8++) {
            Download download = list.get(i8);
            int i9 = download.state;
            if (i9 == 0) {
                z6 = true;
            } else if (i9 == 2) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z9 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z7 |= z3;
                i7++;
                z5 = true;
            } else if (i9 == 5) {
                z8 = true;
            } else if (i9 == 7) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z9 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z7 |= z3;
                i7++;
                z5 = true;
            }
        }
        if (!z5) {
            if (!z6 || i2 == 0) {
                if (z8) {
                    i4 = C9460R.string.exo_download_removing;
                } else {
                    i3 = 0;
                }
                z = true;
            } else {
                i3 = (i2 & 2) != 0 ? C9460R.string.exo_download_paused_for_wifi : (i2 & 1) != 0 ? C9460R.string.exo_download_paused_for_network : C9460R.string.exo_download_paused;
                z = false;
            }
            if (z) {
                if (z5) {
                    int i10 = (int) (f / i7);
                    if (z9 && z7) {
                        z4 = true;
                    }
                    i6 = i10;
                    z2 = z4;
                } else {
                    i6 = 0;
                    z2 = true;
                }
                i5 = 100;
            } else {
                i5 = 0;
                i6 = 0;
                z2 = false;
            }
            return buildNotification(context, i, pendingIntent, str, i3, i5, i6, z2, true, false);
        }
        i4 = C9460R.string.exo_download_downloading;
        i3 = i4;
        z = true;
        if (z) {
            if (z5) {
                int i11 = (int) (f / i7);
                if (z9) {
                    z4 = true;
                }
                i6 = i11;
                z2 = z4;
            } else {
                i6 = 0;
                z2 = true;
            }
            i5 = 100;
        } else {
            i5 = 0;
            i6 = 0;
            z2 = false;
        }
        return buildNotification(context, i, pendingIntent, str, i3, i5, i6, z2, true, false);
    }
}
