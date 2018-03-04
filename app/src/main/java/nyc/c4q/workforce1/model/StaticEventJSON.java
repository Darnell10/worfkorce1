package nyc.c4q.workforce1.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shant on 3/3/2018.
 */

public class StaticEventJSON {

    private static String eventsJSON = "{\"array\":[\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Allied Universal\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hr. certificate and security license. HSD/GED is required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Manhattan\",\n" +
            "\"check_in_from\": \"1:00 PM\",\n" +
            "\"check_in_to\": \"1:30 PM\",\n" +
            "\"company_name_or_type\": \"Edison Properties\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Parking Attendants\",\n" +
            "\"job_family\": \"Customer Service (Non-Sales)\",\n" +
            "\"location\": \"Washington Heights Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"516 West 181st Street 5th floor, New York, New York 10033\",\n" +
            "\"qualifications\": \"Minimum of 1-2 years of experience working in a customer service environment. Background in retail, hospitality, cash handling, or accounting is preferred. H.S. Diploma or GED required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Avant\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Foot/Internal Couriers\",\n" +
            "\"job_family\": \"Customer Service (Non-Sales)\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have good customer service skills. Availability from 7am to 7pm.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Royal Care\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Certified HHA\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have original certificate. Must be able to work in a physically demanding environment.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Royal Care\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Certified HHA\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have original certificate. Must be able to work in a physically demanding environment.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Core SVCS\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Case Manager\",\n" +
            "\"job_family\": \"Social Work, Child Care, Counseling\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Bachelor\u0092s Degree in Human Services is required. Must have experience working as a Case Manager or similar Capacity.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Sottile Security\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hour certificate and NYS Security License. Must have minimum of 1 year security guard experience. Must be able to stand for long periods of time. Must have open and flexible availability.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Sera Security Services LLC\",\n" +
            "\"event_date\": \"Friday, March 2\",\n" +
            "\"event_title\": \"Field Supervisor\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have minimum 1 year of experience as a Field Supervisor. Must have valid Driver\u0092s License. Must have F-803.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Metro One\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hr. certificate and security license. HSD/GED is required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Secured Enterprise Protection\",\n" +
            "\"event_date\": \"Friday, March 02, 2018\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a valid NYS Security Guard License and an active Driver's License. Must have open availability and be able to travel within the 5 boroughs.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Brooklyn\",\n" +
            "\"check_in_from\": \"1:45 PM\",\n" +
            "\"check_in_to\": \"2:00 PM\",\n" +
            "\"company_name_or_type\": \"Primark\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Sales Associates, Stock Associates, Visual Leaders, Department Managers, Sales Managers\",\n" +
            "\"job_family\": \"Sales, Marketing, Wholesaling\",\n" +
            "\"location\": \"Brooklyn Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"9 Bond Street, 5th Floor, Brooklyn, NY 11201\",\n" +
            "\"qualifications\": \"Sales & Stock Associates- Must have at least 2-3 years of stock, visual or customer service sales experience. .  Primark Leaders & Managers - must have 3-5 years of current retail management experience. Open availability to close 3 times a week and open on the weekends. Must have experience training staff and communicating with the corporate office. Must also know how to track sales and complete manager operational reports. Visual leaders must have a portfolio. There are no exceptions to these requirements.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Gate Gourmet\",\n" +
            "\"event_date\": \"Thursday, March 1\",\n" +
            "\"event_title\": \"Food Preps\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"No experience necessary. Must have flexible availability including nights and weekends. Must be able to frequently lift and carry up to 50 pounds.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Maven Care\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Certified HHA\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must be certified as a Home Health Aide in New York State. Must have original certificate.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Airway\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Cleaners\",\n" +
            "\"job_family\": \"Building Cleaning and Maintenance\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Candidates must have indoor or outdoor cleaning experience.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Allen Health Care\",\n" +
            "\"event_date\": \"Thursday, March 01, 2018\",\n" +
            "\"event_title\": \"Non-Certified HHA's\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have HSD/GED. Must have open and flexible availability.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Staten Island\",\n" +
            "\"check_in_from\": \"9:00 AM\",\n" +
            "\"check_in_to\": \"12:00 PM\",\n" +
            "\"company_name_or_type\": \"Secure Electric\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Jr. Mechanic Recruitment Event\",\n" +
            "\"job_family\": \"Construction, Architecture\",\n" +
            "\"location\": \"ITC - Staten Island\",\n" +
            "\"location_name_and_address\": \"1972 Richmond Terrace, Staten Island, NY 10302\",\n" +
            "\"qualifications\": \"Must have 4-6 years of electrical construction experience. Must have knowledge of pipe bending, blueprint reading, NEC Codes, trouble shooting and more. Must have OSHA 10.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Beau Dietl & Associates\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have 8 & 16 hr. certificate and the New York State Security Guard License. Must have minimum 2 years of experience. Must have schedule flexibility, including weekends.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Tiles Unlimited, Inc.\",\n" +
            "\"event_date\": \"Tuesday, February 27\",\n" +
            "\"event_title\": \"Full Charge Bookkeeper\",\n" +
            "\"job_family\": \"Office, Administration, Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have Bachelor\u0092s Degree in Accounting, Business Administration, or equivalent. Must have experience in a retail operation. Must have excellent communication and organizational skills. Must have experience with Module-Based Accounting Software. Must have advanced computer and internet skills, including Microsoft Excel.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"9:00 AM\",\n" +
            "\"check_in_to\": \"12:00 PM\",\n" +
            "\"company_name_or_type\": \"Precision Pipeline\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Meter Inspector\",\n" +
            "\"job_family\": \"Construction, Architecture, Skilled Labor\",\n" +
            "\"location\": \"ITC - Long Island\",\n" +
            "\"location_name_and_address\": \"Long Island City Workforce1 Industrial & Transportation Career Center, 47-10 Austell Place, Long Island City, NY 11101\",\n" +
            "\"qualifications\": \"Inspect Gas Meters for leaks and damage\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"S&A Unified Home Care\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"New York State Certified HHA's\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have original certificate. Must be able to work in a physically demanding environment.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Personal Touch\",\n" +
            "\"event_date\": \"Wednesday, February 28\",\n" +
            "\"event_title\": \"Home Health Aide, Certified Nursing Assistant, Housekeeping\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"No experience required. Training will be provided.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Secured Enterprise Protection\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a valid NYS Security Guard License and an active Driver's License. Must have open availability and be able to travel within the 5 boroughs.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Primeflight Aviation\",\n" +
            "\"event_date\": \"Wednesday, February 28\",\n" +
            "\"event_title\": \"Cabin Cleaners, Baggage Handlers\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must be able to continuously lift/pull/push 50 pounds. Must have full open weekly availability, with no restrictions.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Brooklyn\",\n" +
            "\"check_in_from\": \"10:15 AM\",\n" +
            "\"check_in_to\": \"10:30 AM\",\n" +
            "\"company_name_or_type\": \"NetCost\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Cashier\",\n" +
            "\"job_family\": \"Sales, Marketing, Wholesaling\",\n" +
            "\"location\": \"Coney Island (Sandy) Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"1906 Mermaid Avenue, 2nd Floor, Brooklyn, NY 11224\",\n" +
            "\"qualifications\": \"Strong communication skills and experience in retail cashier or sales.  Russian Speaking highly encouraged to apply. \"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"12:00 PM\",\n" +
            "\"check_in_to\": \"12:30 PM\",\n" +
            "\"company_name_or_type\": \"Do & Co\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Kitchen Staff\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Rockaway Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"57-17 Shore Front Parkway, Arverne, NY 11692\",\n" +
            "\"qualifications\": \"Must be able to stand for prolonged periods of time and move, lift, carry, pull or push as needed.  Must be able to work a flexible schedule, including nights and weekends.  Previous work experience as Dishwasher, Line Cook, Porter, or Prep Cook required.  H.S. Diploma or equivalent preferred.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Brooklyn\",\n" +
            "\"check_in_from\": \"10:15 AM\",\n" +
            "\"check_in_to\": \"10:30 AM\",\n" +
            "\"company_name_or_type\": \"NetCost\",\n" +
            "\"event_date\": \"Thursday, March 01, 2018\",\n" +
            "\"event_title\": \"Stock\",\n" +
            "\"job_family\": \"Sales, Marketing, Wholesaling\",\n" +
            "\"location\": \"Coney Island (Sandy) Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"1906 Mermaid Avenue, 2nd Floor, Brooklyn, NY 11224\",\n" +
            "\"qualifications\": \"Ability to work flexible hours. Ability to stand, bend, twist, reach, push, pull and regularly lift 25-50 lbs. Ability to work in refrigerated coolers and high moisture rooms for extended periods of time.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Watchguard 24/7 Security\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Licensed Security Guards/Field Supervisor\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hr. certificate and security license. HSD/GED is required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Rapid Armored\",\n" +
            "\"event_date\": \"Friday, March 2\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a valid NYS Security Guard License and an active Driver's License. Applicant must have open availability and be able to travel within the 5 boroughs.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Watchguard 24/7 Security\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Licensed Security Guards/Field Supervisor\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hr. certificate and security license. HSD/GED is required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Metro One\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hr. certificate and security license. HSD/GED is required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Metro One\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hr. certificate and security license. HSD/GED is required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Metro One\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hr. certificate and security license. HSD/GED is required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Royal Care\",\n" +
            "\"event_date\": \"Tuesday, February 27\",\n" +
            "\"event_title\": \"Certified HHA\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have original certificate. Must be able to work in a physically demanding environment.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Swissport\",\n" +
            "\"event_date\": \"Tuesday, February 27\",\n" +
            "\"event_title\": \"FT Bag Room Agents\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must be able to continuously lift/pull/push 50 pounds. Must be a U.S. citizen or show proof of right to work in the U.S. Must have full open weekly availability, with no restrictions at all.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"9:00 AM\",\n" +
            "\"check_in_to\": \"12:00 PM\",\n" +
            "\"company_name_or_type\": \"Fly Cleaners\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Fly Cleaners Delivery\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"ITC - Long Island\",\n" +
            "\"location_name_and_address\": \"Long Island City Workforce1 Industrial & Transportation Career Center, 47-10 Austell Place, Long Island City, NY 11101\",\n" +
            "\"qualifications\": \"Manhattan/ Brooklyn Must have drivers license for 3 years and 1 yr professional driving experience truck. $13 +  Tips (NH)\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"GCA Services\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Greeters/Vehicle Service Agents/Shuttlers/Transporters\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid driver\u0092s license.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Swissport\",\n" +
            "\"event_date\": \"Tuesday, February 27\",\n" +
            "\"event_title\": \"FT Ramp Agents\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a valid Driver's License. Must be able to continuously lift/pull/push 50 pounds. Must be a U.S. citizen or show proof of right to work in the U.S. Must have full open weekly availability, with no restrictions at all.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Sara Companions\",\n" +
            "\"event_date\": \"Wednesday, February 28\",\n" +
            "\"event_title\": \"Patient Health Assessors\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"LPN or RN degree required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Manhattan\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Food Kick\",\n" +
            "\"event_date\": \"Friday, March 2\",\n" +
            "\"event_title\": \"Inventory/Stock Associates\",\n" +
            "\"job_family\": \"Customer Service (Non-Sales)\",\n" +
            "\"location\": \"Midtown Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"1250 Broadway, Suite 810, New York, New York, 10001\",\n" +
            "\"qualifications\": \"Must have HSD/GED. Must have at least 6 months of inventory/warehouse experience. Must have open availability and flexibility to work various schedules, including nights and weekends. Must be able to lift up to 50lbs.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Miller & Milone\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Assistant Discharge Planner\",\n" +
            "\"job_family\": \"Social Work, Child Care, Counseling\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have excellent communication and organizational skills. Must be willing to travel to client locations in the five boroughs, Long Island, or Westchester, up to 3 times per month. Must have a clean driving record and a reliable, full-insured vehicle. Must be proficient in Microsoft Office.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Manhattan\",\n" +
            "\"check_in_from\": \"1:00 PM\",\n" +
            "\"check_in_to\": \"1:30 PM\",\n" +
            "\"company_name_or_type\": \"GGMC\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Flaggers\",\n" +
            "\"job_family\": \"Customer Service (Non-Sales)\",\n" +
            "\"location\": \"Washington Heights Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"516 West 181st Street 5th floor, New York, New York 10033\",\n" +
            "\"qualifications\": \"Valid U.S driver\u0092s license and must be able to drive a manual transmission vehicle (stick shift) is required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Staten Island\",\n" +
            "\"check_in_from\": \"9:00 AM\",\n" +
            "\"check_in_to\": \"12:00 PM\",\n" +
            "\"company_name_or_type\": \"RGBS Energy\",\n" +
            "\"event_date\": \"Thursday, March 01, 2018\",\n" +
            "\"event_title\": \"Estimator Recruitment Event\",\n" +
            "\"job_family\": \"Construction, Architecture\",\n" +
            "\"location\": \"ITC - Staten Island\",\n" +
            "\"location_name_and_address\": \"1972 Richmond Terrace, Staten Island, NY 10302\",\n" +
            "\"qualifications\": \"Minimum three years\u0092 controls or electrical project estimating experience. Electrical or controls background a must. Valid NYS Driver\u0092s License. Ability to provide accurate estimates for our controls projects. Ability to establish and maintain relationships with suppliers and contractors. Ability to estimate time required for different control project tasks. Ability to estimate equipment required for projects. Good fundamental knowledge of EXCEL and computer skills. Work with contract administrator regarding bid document requirements. Setting up schedule of values for projects. Track and analyze competition and market pricing. Pay Rate is Dependent on Experience!\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Beau Dietl & Associates\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Fire Safety Directors\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must be F89 certified. Must have minimum 1 year experience. Must have experience in a hotel environment and conducting Fire Drills. Must have schedule flexibility, including weekends.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"9:00 AM\",\n" +
            "\"check_in_to\": \"12:00 PM\",\n" +
            "\"company_name_or_type\": \"Precision Pipeline\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Meter Inspector\",\n" +
            "\"job_family\": \"Construction, Architecture, Skilled Labor\",\n" +
            "\"location\": \"ITC - Long Island\",\n" +
            "\"location_name_and_address\": \"Long Island City Workforce1 Industrial & Transportation Career Center, 47-10 Austell Place, Long Island City, NY 11101\",\n" +
            "\"qualifications\": \"Inspect Gas Meters for leaks and damage\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Metro One\",\n" +
            "\"event_date\": \"Tuesday, February 27\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hr. certificate and security license. HSD/GED is required.\"\n" +
            "},\n" +
            "{},\n" +
            "{},\n" +
            "{},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Fleetlogix\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Auto Technician, Vehicle Service Agents/Shuttlers/Transporters\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid driver\u0092s license.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Manhattan\",\n" +
            "\"check_in_from\": \"9:30 AM\",\n" +
            "\"check_in_to\": \"10:00 AM\",\n" +
            "\"company_name_or_type\": \"Edison Properties\",\n" +
            "\"event_date\": \"Thursday, March 01, 2018\",\n" +
            "\"event_title\": \"Storage Associate\",\n" +
            "\"job_family\": \"Customer Service (Non-Sales)\",\n" +
            "\"location\": \"Upper Manhattan Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"215 125th Street, 6th Floor, New York, NY 10027\",\n" +
            "\"qualifications\": \"Minimum of one year of customer service experience.  H.S. Diploma or GED required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Brooklyn\",\n" +
            "\"check_in_from\": \"1:45 PM\",\n" +
            "\"check_in_to\": \"2:00 PM\",\n" +
            "\"company_name_or_type\": \"LCG Community Services\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Maintenance\",\n" +
            "\"job_family\": \"Building Cleaning and Maintenance\",\n" +
            "\"location\": \"Brooklyn Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"9 Bond Street, 5th Floor, Brooklyn, NY 11201\",\n" +
            "\"qualifications\": \"Maintenance - 1 Year experience with building repair required. Knowledge in entry level plumbing, electrical and minor repairs. Able to put up sheet rock and plaster required. Own tools and driver\u0092s license a plus.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Sottile Security\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hour certificate and NYS Security License. Must have minimum of 1 year security guard experience. Must be able to stand for long periods of time. Must have open and flexible availability.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Dependable Home Care\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Certified HHA\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a current certificate.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"SSP America\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Line Cooks, Prep Cooks\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have minimum of 1 year experience. Must have flexible availability.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"IHOP\",\n" +
            "\"event_date\": \"Thursday, March 01, 2018\",\n" +
            "\"event_title\": \"Cooks\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have flexible availability.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"WestHab\",\n" +
            "\"event_date\": \"Thursday, March 1\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hr, fireguard and security license. HSD/GED is required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Swissport\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"FT Ramp Agents\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a valid Driver's License. Must be able to continuously lift/pull/push 50 pounds. Must be a U.S. citizen or show proof of right to work in the U.S. Must have full open weekly availability, with no restrictions at all.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Manhattan\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Chick-Fil-A\",\n" +
            "\"event_date\": \"Friday, March 2\",\n" +
            "\"event_title\": \"FOH and BOH Team Members\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Midtown Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"1250 Broadway, Suite 810, New York, New York, 10001\",\n" +
            "\"qualifications\": \"Must have HSD/GED. Must have great customer service experience.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Sera Security Services LLC\",\n" +
            "\"event_date\": \"Friday, March 2\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hour certificate and NYS Security License. Must be able to stand for long periods of time.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Red Lobster\",\n" +
            "\"event_date\": \"Thursday, March 01, 2018\",\n" +
            "\"event_title\": \"Line Cooks\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have at least 1 year of experience as a line cook. Must be able to prepare high quality food items and follow recipe.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"NY Foundling\",\n" +
            "\"event_date\": \"Thursday, March 01, 2018\",\n" +
            "\"event_title\": \"Residential Habilitation Specialist\",\n" +
            "\"job_family\": \"Social Work, Child Care, Counseling\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Bachelor\u0092s degree is required. Must have minimum 1 year experience working with OPWDD or 1 year experience as a Direct Support Professional.\"\n" +
            "},\n" +
            "{},\n" +
            "{},\n" +
            "{},\n" +
            "{},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"9:00 AM\",\n" +
            "\"check_in_to\": \"9:30 AM\",\n" +
            "\"company_name_or_type\": \"Family Dollar\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Assistant Manager\",\n" +
            "\"job_family\": \"Sales, Marketing, Wholesaling\",\n" +
            "\"location\": \"Rockaway Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"57-17 Shore Front Parkway, Arverne, NY 11692\",\n" +
            "\"qualifications\": \"Must have one to two years of drug store or retail experience.  Must have excellent customer service skills.  H.S. Diploma or equivalent preferred.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"NY Foundling\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Community Habilitation Specialist\",\n" +
            "\"job_family\": \"Social Work, Child Care, Counseling\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Bachelor\u0092s Degree is required or currently enrolled in matriculated program.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Best Buy\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Sales Representatives\",\n" +
            "\"job_family\": \"Sales, Marketing, Wholesaling\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have minimum of 1 year experience working in customer service, sales or retail. Must have strong knowledge of computers. HSD/GED is required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Priority 1 Security\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hr. certificate and NYS Security Guard License. HSD/GED is required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Core SVCS\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Residential Aide\",\n" +
            "\"job_family\": \"Social Work, Child Care, Counseling\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"HSD/GED is required. Must have security guard experience.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Core SVCS\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Residential Aide\",\n" +
            "\"job_family\": \"Social Work, Child Care, Counseling\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"HSD/GED is required. Must have security guard experience.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Maven Care\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Certified HHA\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must be certified as a Home Health Aide in New York State. Must have original certificate.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Heart to Heart\",\n" +
            "\"event_date\": \"Thursday, March 1\",\n" +
            "\"event_title\": \"Non-Certified HHA's\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have HSD/GED. Must have open and flexible availability.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Manhattan\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Sottile Security\",\n" +
            "\"event_date\": \"Tuesday, February 27\",\n" +
            "\"event_title\": \"Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Midtown Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"1250 Broadway, Suite 810, New York, New York, 10001\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hour certificate and NYS Security License. Must have minimum of 1 year security guard experience. Must be able to stand for long periods of time. Must have open and flexible availability.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"12:00 PM\",\n" +
            "\"check_in_to\": \"12:30 PM\",\n" +
            "\"company_name_or_type\": \"Family Dollar\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Customer Service Representative\",\n" +
            "\"job_family\": \"Sales, Marketing, Wholesaling\",\n" +
            "\"location\": \"Rockaway Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"57-17 Shore Front Parkway, Arverne, NY 11692\",\n" +
            "\"qualifications\": \"Minimum of six months of retail experience.  Must have excellent customer service skills and ability to lift up to 40 lbs.  H.S. Diploma or equivalent preferred.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"SOS Security\",\n" +
            "\"event_date\": \"Thursday, March 01, 2018\",\n" +
            "\"event_title\": \"Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"HSD/GED is required. Must have valid 8 & 16 hr. certificate and security license.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"9:00 AM\",\n" +
            "\"check_in_to\": \"12:00 PM\",\n" +
            "\"company_name_or_type\": \"Chariot\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Chariot (Greenpoint) - CDL Shuttle Driver\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"ITC - Long Island\",\n" +
            "\"location_name_and_address\": \"Long Island City Workforce1 Industrial & Transportation Career Center, 47-10 Austell Place, Long Island City, NY 11101\",\n" +
            "\"qualifications\": \"Part-time (30 \u0096 32 hrs/wk) $18.00 + Benefits + Signing Bonus Must have CDL with passenger endorsement, must have friendly and outgoing personality, must have flexible weekend schedule, must have clean driving record (NH)\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"9:00 AM\",\n" +
            "\"check_in_to\": \"12:00 PM\",\n" +
            "\"company_name_or_type\": \"Swissport\",\n" +
            "\"event_date\": \"Thursday, March 01, 2018\",\n" +
            "\"event_title\": \"Ramp Agent\",\n" +
            "\"job_family\": \"Aviation\",\n" +
            "\"location\": \"ITC - Long Island\",\n" +
            "\"location_name_and_address\": \"Long Island City Workforce1 Industrial & Transportation Career Center, 47-10 Austell Place, Long Island City, NY 11101\",\n" +
            "\"qualifications\": \"(JFK Airport) NYS driver license required. Must be able to work night, weekends, holidays and varying schedules. $13(AC)\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"WestHab\",\n" +
            "\"event_date\": \"Wednesday, February 28\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hr, fireguard and security license. HSD/GED is required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"OTG Management\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Prep Cooks, Line Cooks\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have minimum of 6 months experience in a restaurant. Must have open and flexible availability. Must be able to work nights, weekends, and holidays.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Brooklyn\",\n" +
            "\"check_in_from\": \"9:15 AM\",\n" +
            "\"check_in_to\": \"9:30 AM\",\n" +
            "\"company_name_or_type\": \"World Market\",\n" +
            "\"event_date\": \"Friday, March 02, 2018\",\n" +
            "\"event_title\": \"Sales Associate, Stock Associate\",\n" +
            "\"job_family\": \"Sales, Marketing, Wholesaling\",\n" +
            "\"location\": \"Coney Island (Sandy) Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"1906 Mermaid Avenue, 2nd Floor, Brooklyn, NY 11224\",\n" +
            "\"qualifications\": \"6 months of related experience strongly preferred.  Open availability is a must.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Manhattan\",\n" +
            "\"check_in_from\": \"1:00 PM\",\n" +
            "\"check_in_to\": \"1:30 PM\",\n" +
            "\"company_name_or_type\": \"Securitas\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Security Guard, Corporate, Residential, Fire Guard- Various Site\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Washington Heights Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"516 West 181st Street 5th floor, New York, New York 10033\",\n" +
            "\"qualifications\": \"Minimum of six months to one year of work related experience.   Must have both a valid 8 and 16 hour certificate and NYS Security Guard License.  H.S. Diploma or GED required. Must have great communication and customer service skills. Must be flexible to work evenings, nights and weekend shifts. Must have reliable transportation or means to commute.  F01, F03 and F04 Fire Guard License preferred.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"9:00 AM\",\n" +
            "\"check_in_to\": \"9:30 AM\",\n" +
            "\"company_name_or_type\": \"People Care Inc.\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Certified Home Health Aide\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Rockaway Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"57-17 Shore Front Parkway, Arverne, NY 11692\",\n" +
            "\"qualifications\": \"Minimum of six months to one year of work related experience, specifically working with the elderly, disabled and infirmed.  Must present your valid HHA license or a copy of your valid HHA license at the interview.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Swissport\",\n" +
            "\"event_date\": \"Tuesday, February 27\",\n" +
            "\"event_title\": \"FT Ramp Agents\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a valid Driver's License. Must be able to continuously lift/pull/push 50 pounds. Must be a U.S. citizen or show proof of right to work in the U.S. Must have full open weekly availability, with no restrictions at all.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Brooklyn\",\n" +
            "\"check_in_from\": \"10:15 AM\",\n" +
            "\"check_in_to\": \"10:30 AM\",\n" +
            "\"company_name_or_type\": \"IHOP\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Short Order Cooks\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Coney Island (Sandy) Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"1906 Mermaid Avenue, 2nd Floor, Brooklyn, NY 11224\",\n" +
            "\"qualifications\": \"Experience strongly preferred. Must be capable of using knives, slicing equipment and other food preparation equipment.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Worldwide Flight Services\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Office Agents, Warehouse Agents, Ramp Agents\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a driver\u0092s license.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Worldwide Flight Services\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Office Agents, Warehouse Agents, Ramp Agents\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a driver\u0092s license.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Manhattan\",\n" +
            "\"check_in_from\": \"1:00 PM\",\n" +
            "\"check_in_to\": \"1:30 PM\",\n" +
            "\"company_name_or_type\": \"PLS Check Cashing\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Customer Service Associate\",\n" +
            "\"job_family\": \"Customer Service (Non-Sales)\",\n" +
            "\"location\": \"Washington Heights Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"516 West 181st Street 5th floor, New York, New York 10033\",\n" +
            "\"qualifications\": \"Open availability is a absolute most (Morning, evenings, weekends and holidays). Bilingual English/Spanish ability preferred. Previous customer service experience preferred.\"\n" +
            "},\n" +
            "{},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"OTG Management\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Servers, Porters, Cashiers\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a HSD/GED. Must have the ability to lift up to 45 pounds. Minimum of 1 year experience is required. Must have open and flexible availability.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Royal Care\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Certified HHA\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have original certificate. Must be able to work in a physically demanding environment.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Applebees\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Cooks, Servers, Greeters\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have minimum of 1 year experience. Must have flexible availability.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Brooklyn\",\n" +
            "\"check_in_from\": \"10:15 AM\",\n" +
            "\"check_in_to\": \"10:30 AM\",\n" +
            "\"company_name_or_type\": \"Applebee's\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Servers\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Coney Island (Sandy) Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"1906 Mermaid Avenue, 2nd Floor, Brooklyn, NY 11224\",\n" +
            "\"qualifications\": \"At least 6 months previous server experience required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Manhattan\",\n" +
            "\"check_in_from\": \"10:00 AM\",\n" +
            "\"check_in_to\": \"10:30 AM\",\n" +
            "\"company_name_or_type\": \"ISSM\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Security Guard, Corporate, Residential, Fire Guard- Various Site\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Washington Heights Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"516 West 181st Street 5th floor, New York, New York 10033\",\n" +
            "\"qualifications\": \"Minimum of six months to one year of work related experience.   Must have both a valid 8 and 16 hour certificate and NYS Security Guard License.  H.S. Diploma or GED required. Must have great communication and customer service skills. Must be flexible to work evenings, nights and weekend shifts. Must have reliable transportation or means to commute.  F01, F03 and F04 Fire Guard License preferred.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Tiles Unlimited, Inc.\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Full Charge Bookkeeper\",\n" +
            "\"job_family\": \"Office, Administration, Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have Bachelor\u0092s Degree in Accounting, Business Administration, or equivalent. Must have experience in a retail operation. Must have excellent communication and organizational skills. Must have experience with Module-Based Accounting Software. Must have advanced computer and internet skills, including Microsoft Excel.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"A&R Food Service\",\n" +
            "\"event_date\": \"Friday, March 02, 2018\",\n" +
            "\"event_title\": \"Counter Attendants, Grill Cooks, Cashiers, Deli Clerks\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have 1 year experience in a food and hospitality. Must have open availability\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Manhattan\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Sottile Security\",\n" +
            "\"event_date\": \"Tuesday, February 27\",\n" +
            "\"event_title\": \"Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Midtown Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"1250 Broadway, Suite 810, New York, New York, 10001\",\n" +
            "\"qualifications\": \"Must have valid 8 & 16 hour certificate and NYS Security License. Must have minimum of 1 year security guard experience. Must be able to stand for long periods of time. Must have open and flexible availability.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"BJ's Brewhouse & Restaurant\",\n" +
            "\"event_date\": \"Tuesday, February 27\",\n" +
            "\"event_title\": \"FOH and BOH Team Members\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have HSD/GED. Must have great customer service.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"1:30 PM\",\n" +
            "\"check_in_to\": \"1:45 PM\",\n" +
            "\"company_name_or_type\": \"Chili's\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Dishwashers\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have the ability to communicate fluently in English. Able to work within a team.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Acacia\",\n" +
            "\"event_date\": \"Friday, March 2\",\n" +
            "\"event_title\": \"Case Managers\",\n" +
            "\"job_family\": \"Social Work, Child Care, Counseling\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Bachelor\u0092s Degree in Human Services is required. Must have experience working as a Case Manager or similar Capacity.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"NY Foundling\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Residential Habilitation Specialist\",\n" +
            "\"job_family\": \"Social Work, Child Care, Counseling\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Bachelor\u0092s degree is required. Must have minimum 1 year experience working with OPWDD or 1 year experience as a Direct Support Professional.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Brooklyn\",\n" +
            "\"check_in_from\": \"1:45 PM\",\n" +
            "\"check_in_to\": \"2:00 PM\",\n" +
            "\"company_name_or_type\": \"Melt Shop\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"General Managers\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Brooklyn Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"9 Bond Street, 5th Floor, Brooklyn, NY 11201\",\n" +
            "\"qualifications\": \"5+ year\u0092s related restaurant Management experience: AGM or GM level.  NYC Food Handler\u0092s License is a Must\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"WestHab\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Case Managers\",\n" +
            "\"job_family\": \"Social Work, Child Care, Counseling\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a Bachelor\u0092s Degree from an accredited institution of higher learning, plus a minimum of 1 year experience.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Sara Companions\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Certified HHA\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"No experience necessary.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Summit Security\",\n" +
            "\"event_date\": \"Tuesday, February 27\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have 8 & 16 hr. certificate and the New York State Security Guard License. Must have minimum 1 years of experience. Must have schedule flexibility, including weekends.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"12:30 PM\",\n" +
            "\"check_in_to\": \"1:00 PM\",\n" +
            "\"company_name_or_type\": \"Transportation Company\",\n" +
            "\"event_date\": \"Thursday, March 1\",\n" +
            "\"event_title\": \"Airport Shuttle Driver Recruitment Event\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"ITC - Queens\",\n" +
            "\"location_name_and_address\": \"168-46 91st Ave, 2nd Floor, Jamaica, NY 11432\",\n" +
            "\"qualifications\": \"Must have a CDL-BP\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Manhattan\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Hudson News Group\",\n" +
            "\"event_date\": \"Tuesday, February 27\",\n" +
            "\"event_title\": \"FT Sales Associates/Stock\",\n" +
            "\"job_family\": \"Sales, Marketing, Wholesaling\",\n" +
            "\"location\": \"Midtown Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"1250 Broadway, Suite 810, New York, New York, 10001\",\n" +
            "\"qualifications\": \"Must have at least 6 months to 1 year of retail experience. Must have strong communication and listening skills. Must have flexibility to work weekends, nights and holidays.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"People Care\",\n" +
            "\"event_date\": \"Wednesday, February 28\",\n" +
            "\"event_title\": \"Non-Certified HHA's\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have the availability to complete a free 3 ½ week certification training. Must have the ability to carry a minimum of 10 lbs and lift a minimum of 30 lbs. Must be able to work Mondays-Fridays some holidays and every other weekend.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Winfield Security\",\n" +
            "\"event_date\": \"Monday, February 26, 2018\",\n" +
            "\"event_title\": \"Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have NYS license and F02 Fire Guard. Must have open availability.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"St. Johns\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"Case Manager\",\n" +
            "\"job_family\": \"Social Work, Child Care, Counseling\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have Associates/Bachelor of Sciences Degree. Must have valid Driver's License. Must have child care experience.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"8:45 AM\",\n" +
            "\"check_in_to\": \"9:00 AM\",\n" +
            "\"company_name_or_type\": \"Preferred Gold\",\n" +
            "\"event_date\": \"Monday, February 26\",\n" +
            "\"event_title\": \"New York State Certified HHA's\",\n" +
            "\"job_family\": \"Healthcare Practitioners and Support\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have original certificate. Must be able to work in a physically demanding environment.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Rapid Armored\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Licensed Security Guards\",\n" +
            "\"job_family\": \"Protective Service\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a valid NYS Security Guard License and an active Driver's License. Applicant must have open availability and be able to travel within the 5 boroughs.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Miller & Milone\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Billing Coordinator\",\n" +
            "\"job_family\": \"Social Work, Child Care, Counseling\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have excellent organizational and communication skills. Must have knowledge of Microsoft Office. Must have basic Math & Accounting software skills.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Manhattan\",\n" +
            "\"check_in_from\": \"9:30 AM\",\n" +
            "\"check_in_to\": \"10:00 AM\",\n" +
            "\"company_name_or_type\": \"The Bean (Café)\",\n" +
            "\"event_date\": \"Thursday, March 01, 2018\",\n" +
            "\"event_title\": \"Barista\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Upper Manhattan Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"215 125th Street, 6th Floor, New York, NY 10027\",\n" +
            "\"qualifications\": \"Minimum one year of barista/café or related experience. H.S. Diploma or GED required.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"10:45 AM\",\n" +
            "\"check_in_to\": \"11:00 AM\",\n" +
            "\"company_name_or_type\": \"Worldwide Flight Services\",\n" +
            "\"event_date\": \"Friday, March 2\",\n" +
            "\"event_title\": \"Office Agents, Warehouse Agents, Ramp Agents\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"Queens Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"168-25 Jamaica Avenue, 2nd Floor, Jamaica, NY 11342\",\n" +
            "\"qualifications\": \"Must have a driver\u0092s license.\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Queens\",\n" +
            "\"check_in_from\": \"9:00 AM\",\n" +
            "\"check_in_to\": \"12:00 PM\",\n" +
            "\"company_name_or_type\": \"Cornucopia Logistics\",\n" +
            "\"event_date\": \"Tuesday, February 27, 2018\",\n" +
            "\"event_title\": \"Delivery\",\n" +
            "\"job_family\": \"Transportation, Shipping, Warehousing\",\n" +
            "\"location\": \"ITC - Long Island\",\n" +
            "\"location_name_and_address\": \"Long Island City Workforce1 Industrial & Transportation Career Center, 47-10 Austell Place, Long Island City, NY 11101\",\n" +
            "\"qualifications\": \"New York, NY Must have customer service, computer skills, able to be on feet for the duration of your shift, lift, transport up to 50 lbs. and navigate the transportation\"\n" +
            "},\n" +
            "{\n" +
            "\"borough\": \"Brooklyn\",\n" +
            "\"check_in_from\": \"10:15 AM\",\n" +
            "\"check_in_to\": \"10:30 AM\",\n" +
            "\"company_name_or_type\": \"IHOP\",\n" +
            "\"event_date\": \"Wednesday, February 28, 2018\",\n" +
            "\"event_title\": \"Servers\",\n" +
            "\"job_family\": \"Food Service and Accommodations\",\n" +
            "\"location\": \"Coney Island (Sandy) Workforce1 Career Center\",\n" +
            "\"location_name_and_address\": \"1906 Mermaid Avenue, 2nd Floor, Brooklyn, NY 11224\",\n" +
            "\"qualifications\": \"1-2 years previous server experience required.\"\n" +
            "}\n" +
            "]}";

    public static List<Event> getListFromJSON() throws JSONException {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(eventsJSON);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JSONArray jsonArray = jsonObject.getJSONArray("array");
        List<Event> events = new ArrayList<>();
        for (int i = 0; i < jsonArray.length() - 1; i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String borough = obj.optString("borough");
            String checkIn = obj.optString("check_in_from");
            String checkOut = obj.optString("check_in_to");
            String comp = obj.optString("company_name_or_type");
            String date = obj.optString("event_date");
            String title = obj.optString("event_title");
            String loc = obj.optString("location");
            String locAdr = obj.optString("location_name_and_address");
            String qual = obj.optString("qualifications");

            Event event = new Event();
            event.setBorough(borough);
            event.setCheckInFrom(checkIn);
            event.setCheckInTo(checkOut);
            event.setCompanyNameOrType(comp);
            event.setEventDate(date);
            event.setEventTitle(title);
            event.setLocation(loc);
            event.setLocationNameAndAddress(locAdr);
            event.setQualifications(qual);
            events.add(event);

        }

        return events;
    }
}
