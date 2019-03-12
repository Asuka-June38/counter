
import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

import com.tenchiken.multicounter.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class CounterActivityTest {

    @Rule
    public ActivityTestRule<CounterActivity> mActivityTestRule = new ActivityTestRule<>(CounterActivity.class);

    @Test
    public void counterActivityTest() {
        ViewInteraction appCompatButton = onView(
allOf(withText("+"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.TableRow")),
0),
2),
isDisplayed()));
        appCompatButton.perform(click());
        
        ViewInteraction appCompatButton2 = onView(
allOf(withText("+"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.TableRow")),
0),
2),
isDisplayed()));
        appCompatButton2.perform(click());
        
        ViewInteraction appCompatButton3 = onView(
allOf(withText("+"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.TableRow")),
0),
2),
isDisplayed()));
        appCompatButton3.perform(click());
        
        ViewInteraction appCompatButton4 = onView(
allOf(withText("+"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.TableRow")),
0),
2),
isDisplayed()));
        appCompatButton4.perform(click());
        
        ViewInteraction appCompatButton5 = onView(
allOf(withText("+"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.TableRow")),
1),
2),
isDisplayed()));
        appCompatButton5.perform(click());
        
        ViewInteraction appCompatButton6 = onView(
allOf(withText("+"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.TableRow")),
1),
2),
isDisplayed()));
        appCompatButton6.perform(click());
        
        ViewInteraction appCompatButton7 = onView(
allOf(withText("+"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.TableRow")),
2),
2),
isDisplayed()));
        appCompatButton7.perform(click());
        
        ViewInteraction appCompatButton8 = onView(
allOf(withText("+"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.TableRow")),
2),
2),
isDisplayed()));
        appCompatButton8.perform(click());
        
        ViewInteraction appCompatButton9 = onView(
allOf(withText("+"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.TableRow")),
0),
2),
isDisplayed()));
        appCompatButton9.perform(click());
        
        ViewInteraction appCompatButton10 = onView(
allOf(withText("+"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.TableRow")),
4),
2),
isDisplayed()));
        appCompatButton10.perform(click());
        
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        
        ViewInteraction appCompatTextView = onView(
allOf(withId(R.id.title), withText("Resulting Data"),
childAtPosition(
childAtPosition(
withClassName(is("android.support.v7.view.menu.ListMenuItemView")),
0),
0),
isDisplayed()));
        appCompatTextView.perform(click());
        
        ViewInteraction appCompatImageButton = onView(
allOf(withContentDescription("Перейти вверх"),
childAtPosition(
allOf(withId(R.id.action_bar),
childAtPosition(
withId(R.id.action_bar_container),
0)),
1),
isDisplayed()));
        appCompatImageButton.perform(click());
        
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        
        ViewInteraction appCompatTextView2 = onView(
allOf(withId(R.id.title), withText("About"),
childAtPosition(
childAtPosition(
withClassName(is("android.support.v7.view.menu.ListMenuItemView")),
0),
0),
isDisplayed()));
        appCompatTextView2.perform(click());
        
        ViewInteraction appCompatImageButton2 = onView(
allOf(withContentDescription("Перейти вверх"),
childAtPosition(
allOf(withId(R.id.action_bar),
childAtPosition(
withId(R.id.action_bar_container),
0)),
1),
isDisplayed()));
        appCompatImageButton2.perform(click());
        
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        
        ViewInteraction appCompatTextView3 = onView(
allOf(withId(R.id.title), withText("Setup Timers"),
childAtPosition(
childAtPosition(
withClassName(is("android.support.v7.view.menu.ListMenuItemView")),
0),
0),
isDisplayed()));
        appCompatTextView3.perform(click());
        
        ViewInteraction appCompatButton11 = onView(
allOf(withText("(Edit)\n[nameless]\n(5)"),
childAtPosition(
childAtPosition(
withId(R.id.activity_all_counters_setup),
0),
0),
isDisplayed()));
        appCompatButton11.perform(click());
        
        ViewInteraction appCompatEditText = onView(
allOf(withId(R.id.nameEditText),
childAtPosition(
childAtPosition(
withId(R.id.activity_single_counter_setup),
0),
1),
isDisplayed()));
        appCompatEditText.perform(click());
        
        ViewInteraction appCompatEditText2 = onView(
allOf(withId(R.id.nameEditText),
childAtPosition(
childAtPosition(
withId(R.id.activity_single_counter_setup),
0),
1),
isDisplayed()));
        appCompatEditText2.perform(replaceText("пр"), closeSoftKeyboard());
        }
    
    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup)parent).getChildAt(position));
            }
        };
    }
    }
