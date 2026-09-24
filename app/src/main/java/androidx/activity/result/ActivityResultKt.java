package androidx.activity.result;

import android.content.Intent;
import kotlin.Metadata;

/* JADX INFO: compiled from: ActivityResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m43474d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\u0002\u001a\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0086\u0002¨\u0006\u0005"}, m43475d2 = {"component1", "", "Landroidx/activity/result/ActivityResult;", "component2", "Landroid/content/Intent;", "activity-ktx_release"}, m43476k = 2, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class ActivityResultKt {
    public static final int component1(ActivityResult activityResult) {
        return activityResult.getResultCode();
    }

    public static final Intent component2(ActivityResult activityResult) {
        return activityResult.getData();
    }
}
