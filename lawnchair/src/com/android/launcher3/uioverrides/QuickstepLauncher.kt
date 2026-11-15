/*
 * Copyright (C) 2025 Lawnchair
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
package com.android.launcher3.uioverrides

import app.lawnchair.LawnchairLauncher

/**
 * Home activity entry point.
 *
 * The class name is intentionally the one used by the AOSP launcher, because the platform
 * hard-codes it: Unisoc's `PhoneWindowManager#powerPress` only calls
 * `sleepDefaultDisplayFromPowerButton` when the top activity class name equals
 * `com.android.launcher3.uioverrides.QuickstepLauncher`, and otherwise just brings the
 * home screen to the front without turning the screen off.
 */
class QuickstepLauncher : LawnchairLauncher()
