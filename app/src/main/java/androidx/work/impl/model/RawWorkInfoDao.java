package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.sqlite.p009db.SupportSQLiteQuery;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface RawWorkInfoDao {
    List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery query);

    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(SupportSQLiteQuery query);
}
