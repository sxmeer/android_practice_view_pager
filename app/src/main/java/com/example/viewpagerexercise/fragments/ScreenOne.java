package com.example.viewpagerexercise.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.viewpagerexercise.Data;
import com.example.viewpagerexercise.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;


public class ScreenOne extends Fragment {
    private static final String TAG = "ScreentOne";
    private static final String DATA = "data";
    private static final String VIEWTAG = "viewtag";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView: ");
        return inflater.inflate(R.layout.fragment_screen_one, container, false);
    }

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "onAttach: ");
        super.onAttach(context);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onViewCreated: ");
        super.onViewCreated(view, savedInstanceState);
//        ((CoordinatorLayout)getView()).removeAllViews();
        TextView textView1 = getView().findViewById(R.id.textView);
        Log.d(TAG, "onViewCreated: "+textView1.getText());
        textView1.setText("hellow");
        Log.d(TAG, "onViewCreated: "+textView1.getText());
        final TextView textView = getView().findViewById(R.id.view_visibility);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Log.d(VIEWTAG, ""+textView.getHeight());
            }
        });


        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson=gsonBuilder.create();
        ArrayList<Data> data = gson.fromJson(getData(), new TypeToken<List<Data>>(){}.getType());
        Log.d(DATA, "onViewCreated: ID"+data.get(0).getId());
        Log.d(DATA, "onViewCreated: interactionCount"+data.get(0).getCount()[3].getCountPOJO().getInteractionCount());
        Log.d(DATA, "onViewCreated: totalCount"+data.get(0).getCount()[3].getCountPOJO().getTotalCount());
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onActivityCreated: ");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG, "onStart: ");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "onResume: ");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG, "onDestroyView: ");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG, "onDetach: ");
        super.onDetach();
    }

    private String getData(){
        return "[\n" +
                "      {\n" +
                "        \"faculty_grade\": null,\n" +
                "        \"scored_percentage\": 0.0,\n" +
                "        \"duration\": null,\n" +
                "        \"is_default\": 0,\n" +
                "        \"updated_at\": \"2019-11-26T15:19:09.000+05:30\",\n" +
                "        \"show_certificate\": 0,\n" +
                "        \"faculty_result_status\": null,\n" +
                "        \"system_result_status\": null,\n" +
                "        \"last_visited_time\": 20191126091224,\n" +
                "        \"id\": 98925,\n" +
                "        \"name\": \"Operational  Risk Management (ORM)\",\n" +
                "        \"slug\": \"operational-risk-management-orm-337-13\",\n" +
                "        \"vcgblorganization_id\": 13,\n" +
                "        \"c_course_start_date\": \"2011-01-06\",\n" +
                "        \"c_course_end_date\": \"2011-01-06\",\n" +
                "        \"actual_end_date\": \"2011-01-06\",\n" +
                "        \"u_created_at\": \"2018-12-19T18:39:51+05:30\",\n" +
                "        \"vccommunity_type_id\": 2,\n" +
                "        \"cu_enroll_start_date\": \"2018-12-19\",\n" +
                "        \"cu_enroll_end_date\": \"2019-12-19\",\n" +
                "        \"courseid\": 76712,\n" +
                "        \"c_course_type\": 2,\n" +
                "        \"course_parent_id\": 76710,\n" +
                "        \"is_regular_batch_complete\": false,\n" +
                "        \"allow_mark_complete\": null,\n" +
                "        \"is_archived\": 0,\n" +
                "        \"expiringDays\": \"Expiring in 22 day(s)\",\n" +
                "        \"grade\": \"NA\",\n" +
                "        \"markcomp_flag\": 1,\n" +
                "        \"redirectToSubtopicFlag\": 0,\n" +
                "        \"subtopicId\": 0,\n" +
                "        \"enrollDay\": \"Wednesday\",\n" +
                "        \"enrollDate\": \"19 Dec\",\n" +
                "        \"enrollyear\": \"2018\",\n" +
                "        \"batchDay\": \"Thursday\",\n" +
                "        \"batchDate\": \"06 Jan\",\n" +
                "        \"batchyear\": \"2011\",\n" +
                "        \"Status\": \"NA\",\n" +
                "        \"score\": \"0.0\",\n" +
                "        \"logo\": \"https://qa-g01.tcsion.com/LX/assets/pvc2_images/course_batch-c64f8d086ccbbdd2c856807b4f963448.jpg\",\n" +
                "        \"total_courses\": 7,\n" +
                "        \"launch_course\": \"/LX/INDEXES/AppLaunchSAML?serviceid=1\\u0026c_id=operational-risk-management-orm-337-13\\u0026app_id=9519\\u0026from_external=true\",\n" +
                "        \"mtopcourselaunchlink\": \"/LX/contents/content_home?c_id=operational-risk-management-orm-337-13\\u0026content_player=true\\u0026mtop_launch=true\",\n" +
                "        \"label\": \"Launch\",\n" +
                "        \"mob_url\": \"/mION/MobileLoginService?action=openLX\\u0026slugId=operational-risk-management-orm-337-13\\u0026buttonName=close\\u0026newWindow=No\\u0026returnUrl=\",\n" +
                "        \"domain\": \"https://qa-g01.tcsion.com\",\n" +
                "        \"isCAABEnabled\": \"false\",\n" +
                "        \"participant_enroll\": \"\",\n" +
                "        \"exam_scheduled\": \"\",\n" +
                "        \"gradelink\": \"\",\n" +
                "        \"certificate_link\": \"\",\n" +
                "        \"reportcardlink\": \"\",\n" +
                "        \"report_link\": \"\",\n" +
                "        \"percentage_completion\": 33.33,\n" +
                "        \"haveTimelineData\": 1,\n" +
                "        \"count\": [\n" +
                "          {\n" +
                "            \"exam\": {\n" +
                "              \"total_count\": 1,\n" +
                "              \"appeared_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 1,\n" +
                "              \"abt_expire\": 0,\n" +
                "              \"eval_count\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"assignment\": {\n" +
                "              \"total_count\": 1,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 1,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"handson\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          { \"interaction\": { \"interaction_total_count\": 0 } }\n" +
                "        ],\n" +
                "        \"default_community_slug\": \"ion-mtop\",\n" +
                "        \"courselaunch_label\": \"Launch\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"faculty_grade\": null,\n" +
                "        \"scored_percentage\": 0.0,\n" +
                "        \"duration\": null,\n" +
                "        \"is_default\": 0,\n" +
                "        \"updated_at\": \"2019-11-27T12:23:47.000+05:30\",\n" +
                "        \"show_certificate\": 0,\n" +
                "        \"faculty_result_status\": null,\n" +
                "        \"system_result_status\": null,\n" +
                "        \"last_visited_time\": 20191119141033,\n" +
                "        \"id\": 103762,\n" +
                "        \"name\": \"Performance Testing Batch  Performance Testing Batch \",\n" +
                "        \"slug\": \"performance-testing-batch-performance-testing-batc-917-13\",\n" +
                "        \"vcgblorganization_id\": 13,\n" +
                "        \"c_course_start_date\": \"2019-06-19\",\n" +
                "        \"c_course_end_date\": \"2020-10-30\",\n" +
                "        \"actual_end_date\": \"2020-10-30\",\n" +
                "        \"u_created_at\": \"2019-06-19T17:54:04+05:30\",\n" +
                "        \"vccommunity_type_id\": 2,\n" +
                "        \"cu_enroll_start_date\": \"2019-06-19\",\n" +
                "        \"cu_enroll_end_date\": \"2020-10-30\",\n" +
                "        \"courseid\": 80747,\n" +
                "        \"c_course_type\": 1,\n" +
                "        \"course_parent_id\": 80742,\n" +
                "        \"is_regular_batch_complete\": false,\n" +
                "        \"allow_mark_complete\": 0,\n" +
                "        \"is_archived\": 0,\n" +
                "        \"expiringDays\": \"Expiring in 338 day(s)\",\n" +
                "        \"grade\": \"NA\",\n" +
                "        \"markcomp_flag\": 0,\n" +
                "        \"redirectToSubtopicFlag\": 0,\n" +
                "        \"subtopicId\": 0,\n" +
                "        \"enrollDay\": \"Wednesday\",\n" +
                "        \"enrollDate\": \"19 Jun\",\n" +
                "        \"enrollyear\": \"2019\",\n" +
                "        \"batchDay\": \"Wednesday\",\n" +
                "        \"batchDate\": \"19 Jun\",\n" +
                "        \"batchyear\": \"2019\",\n" +
                "        \"Status\": \"NA\",\n" +
                "        \"score\": \"0.0\",\n" +
                "        \"logo\": \"https://qa-g01.tcsion.com/LX/assets/pvc2_images/course_batch-c64f8d086ccbbdd2c856807b4f963448.jpg\",\n" +
                "        \"total_courses\": 7,\n" +
                "        \"launch_course\": \"/LX/INDEXES/AppLaunchSAML?serviceid=1\\u0026c_id=performance-testing-batch-performance-testing-batc-917-13\\u0026app_id=9519\\u0026from_external=true\",\n" +
                "        \"mtopcourselaunchlink\": \"/LX/contents/content_home?c_id=performance-testing-batch-performance-testing-batc-917-13\\u0026content_player=true\\u0026mtop_launch=true\",\n" +
                "        \"label\": \"Launch\",\n" +
                "        \"mob_url\": \"/mION/MobileLoginService?action=openLX\\u0026slugId=performance-testing-batch-performance-testing-batc-917-13\\u0026buttonName=close\\u0026newWindow=No\\u0026returnUrl=\",\n" +
                "        \"domain\": \"https://qa-g01.tcsion.com\",\n" +
                "        \"isCAABEnabled\": \"false\",\n" +
                "        \"participant_enroll\": \"\",\n" +
                "        \"exam_scheduled\": \"\",\n" +
                "        \"gradelink\": \"\",\n" +
                "        \"certificate_link\": \"\",\n" +
                "        \"reportcardlink\": \"\",\n" +
                "        \"report_link\": \"\",\n" +
                "        \"percentage_completion\": 0.0,\n" +
                "        \"haveTimelineData\": 1,\n" +
                "        \"count\": [\n" +
                "          {\n" +
                "            \"exam\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"appeared_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0,\n" +
                "              \"eval_count\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"assignment\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"handson\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          { \"interaction\": { \"interaction_total_count\": 1 } }\n" +
                "        ],\n" +
                "        \"default_community_slug\": \"ion-mtop\",\n" +
                "        \"courselaunch_label\": \"Launch\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"faculty_grade\": null,\n" +
                "        \"scored_percentage\": 0.0,\n" +
                "        \"duration\": null,\n" +
                "        \"is_default\": 0,\n" +
                "        \"updated_at\": \"2019-10-15T16:04:58.000+05:30\",\n" +
                "        \"show_certificate\": 1,\n" +
                "        \"faculty_result_status\": null,\n" +
                "        \"system_result_status\": null,\n" +
                "        \"last_visited_time\": 20190918160204,\n" +
                "        \"id\": 103327,\n" +
                "        \"name\": \"Video Conference in iDL\",\n" +
                "        \"slug\": \"video-conference-in-idl-32-13\",\n" +
                "        \"vcgblorganization_id\": 13,\n" +
                "        \"c_course_start_date\": \"2019-05-24\",\n" +
                "        \"c_course_end_date\": \"2022-02-16\",\n" +
                "        \"actual_end_date\": \"2022-02-16\",\n" +
                "        \"u_created_at\": \"2019-05-24T18:03:59+05:30\",\n" +
                "        \"vccommunity_type_id\": 2,\n" +
                "        \"cu_enroll_start_date\": \"2019-05-24\",\n" +
                "        \"cu_enroll_end_date\": \"2022-02-16\",\n" +
                "        \"courseid\": 80464,\n" +
                "        \"c_course_type\": 1,\n" +
                "        \"course_parent_id\": 74424,\n" +
                "        \"is_regular_batch_complete\": false,\n" +
                "        \"allow_mark_complete\": 0,\n" +
                "        \"is_archived\": 0,\n" +
                "        \"expiringDays\": \"Expiring in 82 Year(s) \\u0026 2 day(s)\",\n" +
                "        \"grade\": \"NA\",\n" +
                "        \"markcomp_flag\": 0,\n" +
                "        \"redirectToSubtopicFlag\": 0,\n" +
                "        \"subtopicId\": 0,\n" +
                "        \"enrollDay\": \"Friday\",\n" +
                "        \"enrollDate\": \"24 May\",\n" +
                "        \"enrollyear\": \"2019\",\n" +
                "        \"batchDay\": \"Friday\",\n" +
                "        \"batchDate\": \"24 May\",\n" +
                "        \"batchyear\": \"2019\",\n" +
                "        \"Status\": \"NA\",\n" +
                "        \"score\": \"0.0\",\n" +
                "        \"logo\": \"https://qa-g01.tcsion.com/LX/assets/pvc2_images/course_batch-c64f8d086ccbbdd2c856807b4f963448.jpg\",\n" +
                "        \"total_courses\": 7,\n" +
                "        \"launch_course\": \"/LX/INDEXES/AppLaunchSAML?serviceid=1\\u0026c_id=video-conference-in-idl-32-13\\u0026app_id=9519\\u0026from_external=true\",\n" +
                "        \"mtopcourselaunchlink\": \"/LX/contents/content_home?c_id=video-conference-in-idl-32-13\\u0026content_player=true\\u0026mtop_launch=true\",\n" +
                "        \"label\": \"Launch\",\n" +
                "        \"mob_url\": \"/mION/MobileLoginService?action=openLX\\u0026slugId=video-conference-in-idl-32-13\\u0026buttonName=close\\u0026newWindow=No\\u0026returnUrl=\",\n" +
                "        \"domain\": \"https://qa-g01.tcsion.com\",\n" +
                "        \"isCAABEnabled\": \"false\",\n" +
                "        \"participant_enroll\": \"\",\n" +
                "        \"exam_scheduled\": \"\",\n" +
                "        \"gradelink\": \"\",\n" +
                "        \"certificate_link\": \"\",\n" +
                "        \"reportcardlink\": \"\",\n" +
                "        \"report_link\": \"\",\n" +
                "        \"percentage_completion\": 0.0,\n" +
                "        \"haveTimelineData\": 1,\n" +
                "        \"count\": [\n" +
                "          {\n" +
                "            \"exam\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"appeared_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0,\n" +
                "              \"eval_count\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"assignment\": {\n" +
                "              \"total_count\": 6,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 6,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"handson\": {\n" +
                "              \"total_count\": 1,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"pending_count\": 1,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          { \"interaction\": { \"interaction_total_count\": 1 } }\n" +
                "        ],\n" +
                "        \"default_community_slug\": \"ion-mtop\",\n" +
                "        \"courselaunch_label\": \"Launch\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"faculty_grade\": null,\n" +
                "        \"scored_percentage\": 0.0,\n" +
                "        \"duration\": null,\n" +
                "        \"is_default\": 0,\n" +
                "        \"updated_at\": \"2019-05-14T18:03:20.000+05:30\",\n" +
                "        \"show_certificate\": 1,\n" +
                "        \"faculty_result_status\": null,\n" +
                "        \"system_result_status\": null,\n" +
                "        \"last_visited_time\": 20190918160129,\n" +
                "        \"id\": 78002,\n" +
                "        \"name\": \"Learning Medium\",\n" +
                "        \"slug\": \"learning-medium\",\n" +
                "        \"vcgblorganization_id\": 13,\n" +
                "        \"c_course_start_date\": \"2011-01-06\",\n" +
                "        \"c_course_end_date\": \"2011-01-06\",\n" +
                "        \"actual_end_date\": \"2011-01-06\",\n" +
                "        \"u_created_at\": \"2017-08-02T10:51:52+05:30\",\n" +
                "        \"vccommunity_type_id\": 2,\n" +
                "        \"cu_enroll_start_date\": \"2017-08-02\",\n" +
                "        \"cu_enroll_end_date\": \"2027-07-30\",\n" +
                "        \"courseid\": 60238,\n" +
                "        \"c_course_type\": 2,\n" +
                "        \"course_parent_id\": 60237,\n" +
                "        \"is_regular_batch_complete\": false,\n" +
                "        \"allow_mark_complete\": null,\n" +
                "        \"is_archived\": 0,\n" +
                "        \"expiringDays\": \"Expiring in 247 Year(s) \\u0026 7 day(s)\",\n" +
                "        \"grade\": \"NA\",\n" +
                "        \"markcomp_flag\": 0,\n" +
                "        \"redirectToSubtopicFlag\": 0,\n" +
                "        \"subtopicId\": 0,\n" +
                "        \"enrollDay\": \"Wednesday\",\n" +
                "        \"enrollDate\": \"02 Aug\",\n" +
                "        \"enrollyear\": \"2017\",\n" +
                "        \"batchDay\": \"Thursday\",\n" +
                "        \"batchDate\": \"06 Jan\",\n" +
                "        \"batchyear\": \"2011\",\n" +
                "        \"Status\": \"NA\",\n" +
                "        \"score\": \"0.0\",\n" +
                "        \"logo\": \"https://qa-g01.tcsion.com/LX/assets/pvc2_images/course_batch-c64f8d086ccbbdd2c856807b4f963448.jpg\",\n" +
                "        \"total_courses\": 7,\n" +
                "        \"launch_course\": \"/LX/INDEXES/AppLaunchSAML?serviceid=1\\u0026c_id=learning-medium\\u0026app_id=9519\\u0026from_external=true\",\n" +
                "        \"mtopcourselaunchlink\": \"/LX/contents/content_home?c_id=learning-medium\\u0026content_player=true\\u0026mtop_launch=true\",\n" +
                "        \"label\": \"Launch\",\n" +
                "        \"mob_url\": \"/mION/MobileLoginService?action=openLX\\u0026slugId=learning-medium\\u0026buttonName=close\\u0026newWindow=No\\u0026returnUrl=\",\n" +
                "        \"domain\": \"https://qa-g01.tcsion.com\",\n" +
                "        \"isCAABEnabled\": \"false\",\n" +
                "        \"participant_enroll\": \"\",\n" +
                "        \"exam_scheduled\": \"\",\n" +
                "        \"gradelink\": \"\",\n" +
                "        \"certificate_link\": \"\",\n" +
                "        \"reportcardlink\": \"\",\n" +
                "        \"report_link\": \"\",\n" +
                "        \"percentage_completion\": 0.0,\n" +
                "        \"haveTimelineData\": 1,\n" +
                "        \"count\": [\n" +
                "          {\n" +
                "            \"exam\": {\n" +
                "              \"total_count\": 1,\n" +
                "              \"appeared_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 1,\n" +
                "              \"abt_expire\": 0,\n" +
                "              \"eval_count\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"assignment\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"handson\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          { \"interaction\": { \"interaction_total_count\": 0 } }\n" +
                "        ],\n" +
                "        \"default_community_slug\": \"ion-mtop\",\n" +
                "        \"courselaunch_label\": \"Launch\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"faculty_grade\": null,\n" +
                "        \"scored_percentage\": 0.0,\n" +
                "        \"duration\": null,\n" +
                "        \"is_default\": 0,\n" +
                "        \"updated_at\": \"2019-01-29T12:44:56.000+05:30\",\n" +
                "        \"show_certificate\": 1,\n" +
                "        \"faculty_result_status\": null,\n" +
                "        \"system_result_status\": null,\n" +
                "        \"last_visited_time\": 20190918160119,\n" +
                "        \"id\": 98878,\n" +
                "        \"name\": \"GDPR Game for TCS iON Batch 01\",\n" +
                "        \"slug\": \"gdpr-implementation-at-tcs-ion-batch-01-247-13\",\n" +
                "        \"vcgblorganization_id\": 13,\n" +
                "        \"c_course_start_date\": \"2018-12-14\",\n" +
                "        \"c_course_end_date\": \"2021-09-16\",\n" +
                "        \"actual_end_date\": \"2021-09-16\",\n" +
                "        \"u_created_at\": \"2019-01-15T12:35:33+05:30\",\n" +
                "        \"vccommunity_type_id\": 2,\n" +
                "        \"cu_enroll_start_date\": \"2019-01-15\",\n" +
                "        \"cu_enroll_end_date\": \"2021-09-08\",\n" +
                "        \"courseid\": 76684,\n" +
                "        \"c_course_type\": 1,\n" +
                "        \"course_parent_id\": 76682,\n" +
                "        \"is_regular_batch_complete\": false,\n" +
                "        \"allow_mark_complete\": 0,\n" +
                "        \"is_archived\": 0,\n" +
                "        \"expiringDays\": \"Expiring in 294 Year(s) \\u0026 1 day(s)\",\n" +
                "        \"grade\": \"NA\",\n" +
                "        \"markcomp_flag\": 0,\n" +
                "        \"redirectToSubtopicFlag\": 0,\n" +
                "        \"subtopicId\": 0,\n" +
                "        \"enrollDay\": \"Tuesday\",\n" +
                "        \"enrollDate\": \"15 Jan\",\n" +
                "        \"enrollyear\": \"2019\",\n" +
                "        \"batchDay\": \"Friday\",\n" +
                "        \"batchDate\": \"14 Dec\",\n" +
                "        \"batchyear\": \"2018\",\n" +
                "        \"Status\": \"NA\",\n" +
                "        \"score\": \"0.0\",\n" +
                "        \"logo\": \"https://qa-g01.tcsion.com/LX/assets/pvc2_images/course_batch-c64f8d086ccbbdd2c856807b4f963448.jpg\",\n" +
                "        \"total_courses\": 7,\n" +
                "        \"launch_course\": \"/LX/INDEXES/AppLaunchSAML?serviceid=1\\u0026c_id=gdpr-implementation-at-tcs-ion-batch-01-247-13\\u0026app_id=9519\\u0026from_external=true\",\n" +
                "        \"mtopcourselaunchlink\": \"/LX/contents/content_home?c_id=gdpr-implementation-at-tcs-ion-batch-01-247-13\\u0026content_player=true\\u0026mtop_launch=true\",\n" +
                "        \"label\": \"Launch\",\n" +
                "        \"mob_url\": \"/mION/MobileLoginService?action=openLX\\u0026slugId=gdpr-implementation-at-tcs-ion-batch-01-247-13\\u0026buttonName=close\\u0026newWindow=No\\u0026returnUrl=\",\n" +
                "        \"domain\": \"https://qa-g01.tcsion.com\",\n" +
                "        \"isCAABEnabled\": \"false\",\n" +
                "        \"participant_enroll\": \"\",\n" +
                "        \"exam_scheduled\": \"\",\n" +
                "        \"gradelink\": \"\",\n" +
                "        \"certificate_link\": \"\",\n" +
                "        \"reportcardlink\": \"\",\n" +
                "        \"report_link\": \"\",\n" +
                "        \"percentage_completion\": 0.0,\n" +
                "        \"haveTimelineData\": 1,\n" +
                "        \"count\": [\n" +
                "          {\n" +
                "            \"exam\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"appeared_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0,\n" +
                "              \"eval_count\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"assignment\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"handson\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          { \"interaction\": { \"interaction_total_count\": 0 } }\n" +
                "        ],\n" +
                "        \"default_community_slug\": \"ion-mtop\",\n" +
                "        \"courselaunch_label\": \"Launch\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"faculty_grade\": null,\n" +
                "        \"scored_percentage\": 0.0,\n" +
                "        \"duration\": null,\n" +
                "        \"is_default\": 0,\n" +
                "        \"updated_at\": \"2019-09-18T16:41:12.000+05:30\",\n" +
                "        \"show_certificate\": 1,\n" +
                "        \"faculty_result_status\": null,\n" +
                "        \"system_result_status\": null,\n" +
                "        \"last_visited_time\": 20190918160057,\n" +
                "        \"id\": 71889,\n" +
                "        \"name\": \"Web Performance Optimization  Course\",\n" +
                "        \"slug\": \"web-performance-optimization-course\",\n" +
                "        \"vcgblorganization_id\": 13,\n" +
                "        \"c_course_start_date\": \"2019-01-31\",\n" +
                "        \"c_course_end_date\": \"2020-12-03\",\n" +
                "        \"actual_end_date\": \"2020-12-03\",\n" +
                "        \"u_created_at\": \"2017-03-29T13:00:03+05:30\",\n" +
                "        \"vccommunity_type_id\": 2,\n" +
                "        \"cu_enroll_start_date\": \"2017-03-29\",\n" +
                "        \"cu_enroll_end_date\": \"2018-03-27\",\n" +
                "        \"courseid\": 55308,\n" +
                "        \"c_course_type\": 1,\n" +
                "        \"course_parent_id\": 49572,\n" +
                "        \"is_regular_batch_complete\": false,\n" +
                "        \"allow_mark_complete\": 0,\n" +
                "        \"is_archived\": 0,\n" +
                "        \"expiringDays\": \"Expiring in 7 Year(s) \\u0026 1 day(s)\",\n" +
                "        \"grade\": \"NA\",\n" +
                "        \"markcomp_flag\": 0,\n" +
                "        \"redirectToSubtopicFlag\": 0,\n" +
                "        \"subtopicId\": 0,\n" +
                "        \"enrollDay\": \"Wednesday\",\n" +
                "        \"enrollDate\": \"29 Mar\",\n" +
                "        \"enrollyear\": \"2017\",\n" +
                "        \"batchDay\": \"Thursday\",\n" +
                "        \"batchDate\": \"31 Jan\",\n" +
                "        \"batchyear\": \"2019\",\n" +
                "        \"Status\": \"NA\",\n" +
                "        \"score\": \"0.0\",\n" +
                "        \"logo\": \"https://qa-g01.tcsion.com/LX/assets/pvc2_images/course_batch-c64f8d086ccbbdd2c856807b4f963448.jpg\",\n" +
                "        \"total_courses\": 7,\n" +
                "        \"launch_course\": \"/LX/INDEXES/AppLaunchSAML?serviceid=1\\u0026c_id=web-performance-optimization-course\\u0026app_id=9519\\u0026from_external=true\",\n" +
                "        \"mtopcourselaunchlink\": \"/LX/contents/content_home?c_id=web-performance-optimization-course\\u0026content_player=true\\u0026mtop_launch=true\",\n" +
                "        \"label\": \"Launch\",\n" +
                "        \"mob_url\": \"/mION/MobileLoginService?action=openLX\\u0026slugId=web-performance-optimization-course\\u0026buttonName=close\\u0026newWindow=No\\u0026returnUrl=\",\n" +
                "        \"domain\": \"https://qa-g01.tcsion.com\",\n" +
                "        \"isCAABEnabled\": \"false\",\n" +
                "        \"participant_enroll\": \"\",\n" +
                "        \"exam_scheduled\": \"\",\n" +
                "        \"gradelink\": \"\",\n" +
                "        \"certificate_link\": \"\",\n" +
                "        \"reportcardlink\": \"\",\n" +
                "        \"report_link\": \"\",\n" +
                "        \"percentage_completion\": 17.39,\n" +
                "        \"haveTimelineData\": 1,\n" +
                "        \"count\": [\n" +
                "          {\n" +
                "            \"exam\": {\n" +
                "              \"total_count\": 9,\n" +
                "              \"appeared_count\": 3,\n" +
                "              \"completed_count\": 1,\n" +
                "              \"pending_count\": 8,\n" +
                "              \"abt_expire\": 0,\n" +
                "              \"eval_count\": 1\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"assignment\": {\n" +
                "              \"total_count\": 6,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 6,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"handson\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          { \"interaction\": { \"interaction_total_count\": 2 } }\n" +
                "        ],\n" +
                "        \"default_community_slug\": \"ion-mtop\",\n" +
                "        \"courselaunch_label\": \"Launch\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"faculty_grade\": null,\n" +
                "        \"scored_percentage\": 0.0,\n" +
                "        \"duration\": null,\n" +
                "        \"is_default\": 0,\n" +
                "        \"updated_at\": \"2019-04-11T09:09:58.000+05:30\",\n" +
                "        \"show_certificate\": 0,\n" +
                "        \"faculty_result_status\": null,\n" +
                "        \"system_result_status\": null,\n" +
                "        \"last_visited_time\": 20190416155507,\n" +
                "        \"id\": 98926,\n" +
                "        \"name\": \"Leadership Talk\",\n" +
                "        \"slug\": \"leadership-talk-430-13\",\n" +
                "        \"vcgblorganization_id\": 13,\n" +
                "        \"c_course_start_date\": \"2011-01-06\",\n" +
                "        \"c_course_end_date\": \"2011-01-06\",\n" +
                "        \"actual_end_date\": \"2011-01-06\",\n" +
                "        \"u_created_at\": \"2018-12-19T18:03:30+05:30\",\n" +
                "        \"vccommunity_type_id\": 2,\n" +
                "        \"cu_enroll_start_date\": \"2018-12-19\",\n" +
                "        \"cu_enroll_end_date\": \"2019-12-20\",\n" +
                "        \"courseid\": 76713,\n" +
                "        \"c_course_type\": 2,\n" +
                "        \"course_parent_id\": 76711,\n" +
                "        \"is_regular_batch_complete\": false,\n" +
                "        \"allow_mark_complete\": null,\n" +
                "        \"is_archived\": 0,\n" +
                "        \"expiringDays\": \"Expiring in 23 day(s)\",\n" +
                "        \"grade\": \"NA\",\n" +
                "        \"markcomp_flag\": 1,\n" +
                "        \"redirectToSubtopicFlag\": 0,\n" +
                "        \"subtopicId\": 0,\n" +
                "        \"enrollDay\": \"Wednesday\",\n" +
                "        \"enrollDate\": \"19 Dec\",\n" +
                "        \"enrollyear\": \"2018\",\n" +
                "        \"batchDay\": \"Thursday\",\n" +
                "        \"batchDate\": \"06 Jan\",\n" +
                "        \"batchyear\": \"2011\",\n" +
                "        \"Status\": \"NA\",\n" +
                "        \"score\": \"0.0\",\n" +
                "        \"logo\": \"https://qa-g01.tcsion.com/LX/assets/pvc2_images/course_batch-c64f8d086ccbbdd2c856807b4f963448.jpg\",\n" +
                "        \"total_courses\": 7,\n" +
                "        \"launch_course\": \"/LX/INDEXES/AppLaunchSAML?serviceid=1\\u0026c_id=leadership-talk-430-13\\u0026app_id=9519\\u0026from_external=true\",\n" +
                "        \"mtopcourselaunchlink\": \"/LX/contents/content_home?c_id=leadership-talk-430-13\\u0026content_player=true\\u0026mtop_launch=true\",\n" +
                "        \"label\": \"Launch\",\n" +
                "        \"mob_url\": \"/mION/MobileLoginService?action=openLX\\u0026slugId=leadership-talk-430-13\\u0026buttonName=close\\u0026newWindow=No\\u0026returnUrl=\",\n" +
                "        \"domain\": \"https://qa-g01.tcsion.com\",\n" +
                "        \"isCAABEnabled\": \"false\",\n" +
                "        \"participant_enroll\": \"\",\n" +
                "        \"exam_scheduled\": \"\",\n" +
                "        \"gradelink\": \"\",\n" +
                "        \"certificate_link\": \"\",\n" +
                "        \"reportcardlink\": \"\",\n" +
                "        \"report_link\": \"\",\n" +
                "        \"percentage_completion\": 100.0,\n" +
                "        \"haveTimelineData\": 1,\n" +
                "        \"count\": [\n" +
                "          {\n" +
                "            \"exam\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"appeared_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0,\n" +
                "              \"eval_count\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"assignment\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"completed_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          {\n" +
                "            \"handson\": {\n" +
                "              \"total_count\": 0,\n" +
                "              \"submiited_count\": 0,\n" +
                "              \"evaluated_count\": 0,\n" +
                "              \"pending_count\": 0,\n" +
                "              \"abt_expire\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          { \"interaction\": { \"interaction_total_count\": 0 } }\n" +
                "        ],\n" +
                "        \"default_community_slug\": \"ion-mtop\",\n" +
                "        \"courselaunch_label\": \"Launch\"\n" +
                "      }\n" +
                "    ]";
    }
}
