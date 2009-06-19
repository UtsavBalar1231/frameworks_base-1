/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.backup;

import android.os.ParcelFileDescriptor;

import java.io.InputStream;

/** @hide */
public interface RestoreHelper {
    /**
     * Called by RestoreHelperDispatcher to dispatch one entity of data.
     * <p class=note>
     * Do not close the <code>data</code> stream.  Do not read more than
     * <code>dataSize</code> bytes from <code>data</code>.
     */
    public void restoreEntity(BackupDataInputStream data);
    public void writeSnapshot(ParcelFileDescriptor fd);
}

