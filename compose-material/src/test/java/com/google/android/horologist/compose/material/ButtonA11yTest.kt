/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.horologist.compose.material

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.google.android.horologist.screenshots.ScreenshotBaseTest
import com.google.android.horologist.screenshots.ScreenshotTestRule.Companion.screenshotTestRuleParams
import org.junit.Test

class ButtonA11yTest : ScreenshotBaseTest(
    screenshotTestRuleParams {
        enableA11y = true
        screenTimeText = {}
    }
) {

    @Test
    fun default() {
        screenshotTestRule.setContent(takeScreenshot = true) {
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
                Button(
                    imageVector = Icons.Default.Check,
                    contentDescription = "contentDescription",
                    onClick = { }
                )
            }
        }
    }

    @Test
    fun disabled() {
        screenshotTestRule.setContent(takeScreenshot = true) {
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
                Button(
                    imageVector = Icons.Default.Check,
                    contentDescription = "contentDescription",
                    onClick = { },
                    enabled = false
                )
            }
        }
    }
}
