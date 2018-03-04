package nyc.c4q.workforce1.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shant on 3/3/2018.
 */

public class StaticJSON {

    private static String jobsJSON = "{\"array\":[\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"To be considered qualified for this position, candidates must have an open and flexible schedule. Candidates should have a friendly and outgoing personality. Some food service/customer service experience is preferred, but not required.\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Staten Island\",\n" +
            "        \"leadfulfillmentcenter\": \"43589\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"40\",\n" +
            "        \"positiondescription\": \"Local Smoothie Franchise is looking to hire a Food Service Team Member for their new Staten Island location.\",\n" +
            "        \"positiontitle\": \"Food Service Team Member\",\n" +
            "        \"positiontype\": \"Food Service and Accommodations\",\n" +
            "        \"sectorname\": \"Accommodation & Food Services\",\n" +
            "        \"sococcupationcode\": \"4\",\n" +
            "        \"sococcupationname\": \"35\",\n" +
            "        \"subsectorname\": \"Limited-Service Restaurants\",\n" +
            "        \"wagemax\": \"14\",\n" +
            "        \"wagemin\": \"13.5\"\n" +
            "    }," +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"Yes\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Operation and Control  Controlling operations of equipment or systems.   Active Listening  Giving full attention to what other people are saying, taking time to understand the points being made, asking questions as appropriate, and not interrupting at inappropriate times.   Speaking  Talking to others to convey information effectively.   Monitoring  Monitoring/Assessing performance of yourself, other individuals, or organizations to make improvements or take corrective action.   Reading Comprehension  Understanding written sentences and paragraphs in work related documents.\",\n" +
            "        \"educationrequired\": \"None\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Industrial & Transportation Center\",\n" +
            "        \"leadfulfillmentcenter\": \"43617\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Obey traffic laws and follow established traffic and transportation procedures.   Turn in receipts and money received from deliveries.   Read maps and follow written or verbal geographic directions.   Verify the contents of inventory loads against shipping papers.   Load and unload trucks, vans, or automobiles\",\n" +
            "        \"positiontitle\": \"CDL 'B' Driver\",\n" +
            "        \"positiontype\": \"Transportation, Shipping\",\n" +
            "        \"sectorname\": \"Manufacturing\",\n" +
            "        \"sococcupationcode\": \"81\",\n" +
            "        \"sococcupationname\": \"53\",\n" +
            "        \"subsectorname\": \"All Other Manufacturing\",\n" +
            "        \"wagemax\": \"18\",\n" +
            "        \"wagemin\": \"15\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"The candidate must be able to place plates, utensils, pans and cases on high and low shelves. They must be capable of using knives, slicing equipment and other food preparation equipment. Mobility is required throughout the entire shift. Strong verbal and written communication skills are also required.\",\n" +
            "        \"educationrequired\": \"None\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Staten Island\",\n" +
            "        \"leadfulfillmentcenter\": \"43574\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"40\",\n" +
            "        \"positiondescription\": \"Chain Restaurant is hiring Line Cooks for its Staten Island locations. The Line Cook will complete all assigned prep work and set up cook's station. They will maintain product presentations, product quality and cook time standards. The Line Cooks will also prepare all menu items according to recipes, plate presentations and specifications. Other responsibilities will include cleaning and sanitizing work stations before, during and after shifts and completing weekly cleaning projects.\",\n" +
            "        \"positiontitle\": \"Line Cook\",\n" +
            "        \"positiontype\": \"Food Service and Accommodations\",\n" +
            "        \"sectorname\": \"Accommodation & Food Services\",\n" +
            "        \"sococcupationcode\": \"4\",\n" +
            "        \"sococcupationname\": \"35\",\n" +
            "        \"subsectorname\": \"Food Services\",\n" +
            "        \"wagemax\": \"13\",\n" +
            "        \"wagemin\": \"13\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"To be considered qualified for this position, candidates must have all necessary certifications. Candidates must be able to work a flexible schedule including nights, weekends and holidays. Candidates must be able to stand for long periods of time and perform all physical activities required by the position. Must have New York State Security License and 8 & 16 Hour certification.\",\n" +
            "        \"educationrequired\": \"None\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Staten Island\",\n" +
            "        \"leadfulfillmentcenter\": \"43688\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Local security company is looking to hire Security Guards for their Staten Island locations. The position entails patrolling assigned areas and manning assigned posts to ensure the safety of both people and property. They will also be expected to take detailed notes on any and all incidents that may occur.\",\n" +
            "        \"positiontitle\": \"Security Guard\",\n" +
            "        \"positiontype\": \"Protective Service\",\n" +
            "        \"sectorname\": \"Administrative, Support, Waste Management and Remediation Services\",\n" +
            "        \"sococcupationcode\": \"4\",\n" +
            "        \"sococcupationname\": \"33\",\n" +
            "        \"subsectorname\": \"Investigation and Security Services\",\n" +
            "        \"wagemax\": \"13\",\n" +
            "        \"wagemin\": \"13\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"To be considered qualified for this position, candidates must have least six months of experience working in a fine dining restaurant.\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Staten Island\",\n" +
            "        \"leadfulfillmentcenter\": \"43842\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"40\",\n" +
            "        \"positiondescription\": \"New restaurant opening in Staten Island is looking to hire Food Service Team Members to fill all positions.\",\n" +
            "        \"positiontitle\": \"Food Service Team Member\",\n" +
            "        \"positiontype\": \"Food Service and Accommodations\",\n" +
            "        \"sectorname\": \"Accommodation & Food Services\",\n" +
            "        \"sococcupationcode\": \"4\",\n" +
            "        \"sococcupationname\": \"35\",\n" +
            "        \"subsectorname\": \"Full-Service Restaurants\",\n" +
            "        \"wagemax\": \"15\",\n" +
            "        \"wagemin\": \"13.5\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"Yes\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Operation and Control  Controlling operations of equipment or systems.   Active Listening  Giving full attention to what other people are saying, taking time to understand the points being made, asking questions as appropriate, and not interrupting at inappropriate times.   Speaking  Talking to others to convey information effectively.   Monitoring  Monitoring/Assessing performance of yourself, other individuals, or organizations to make improvements or take corrective action.   Reading Comprehension  Understanding written sentences and paragraphs in work related documents.\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Industrial & Transportation Center\",\n" +
            "        \"leadfulfillmentcenter\": \"43616\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Obey traffic laws and follow established traffic and transportation procedures.   Turn in receipts and money received from deliveries.   Read maps and follow written or verbal geographic directions.   Verify the contents of inventory loads against shipping papers.   Load and unload trucks, vans, or automobiles.\",\n" +
            "        \"positiontitle\": \"CDL 'B' Driver\",\n" +
            "        \"positiontype\": \"Transportation, Shipping\",\n" +
            "        \"sectorname\": \"Wholesale Trade\",\n" +
            "        \"sococcupationcode\": \"81\",\n" +
            "        \"sococcupationname\": \"53\",\n" +
            "        \"subsectorname\": \"Wholesale Trade\",\n" +
            "        \"wagemax\": \"18\",\n" +
            "        \"wagemin\": \"16\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"Yes\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Operation and Control  Controlling operations of equipment or systems.   Operation Monitoring  Watching gauges, dials, or other indicators to make sure a machine is working properly.   Time Management  Managing one's own time and the time of others.   Critical Thinking  Using logic and reasoning to identify the strengths and weaknesses of alternative solutions, conclusions or approaches to problems.   Monitoring  Monitoring/Assessing performance of yourself, other individuals, or organizations to make improvements or take corrective action.\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Industrial & Transportation Center\",\n" +
            "        \"leadfulfillmentcenter\": \"43685\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Check vehicles to ensure that mechanical, safety, and emergency equipment is in good working order.   Follow appropriate safety procedures for transporting dangerous goods.   Inspect loads to ensure that cargo is secure.   Maintain logs of working hours or of vehicle service or repair status, following applicable state and federal regulations.   Secure cargo for transport, using ropes, blocks, chain, binders, or covers.\",\n" +
            "        \"positiontitle\": \"CDL 'B' Driver\",\n" +
            "        \"positiontype\": \"Transportation, Shipping\",\n" +
            "        \"sectorname\": \"Wholesale Trade\",\n" +
            "        \"sococcupationcode\": \"81\",\n" +
            "        \"sococcupationname\": \"53\",\n" +
            "        \"subsectorname\": \"Wholesale Trade\",\n" +
            "        \"wagemax\": \"17\",\n" +
            "        \"wagemin\": \"16\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"Yes\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Must have at least 3 years of experience working as either a Pipefitter or HVAC Sheet Metal Installer ( Tin-Knocker) OSHA 10 required  Drivers License preferred\",\n" +
            "        \"educationrequired\": \"High School/GED\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Industrial & Transportation Center\",\n" +
            "        \"leadfulfillmentcenter\": \"43658\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"An NY based HVAC Company is seeking experienced Tin-Knockers\",\n" +
            "        \"positiontitle\": \"Tin Knocker\",\n" +
            "        \"positiontype\": \"Equipment Repair and Maintenance\",\n" +
            "        \"sectorname\": \"Construction\",\n" +
            "        \"sococcupationcode\": \"81\",\n" +
            "        \"sococcupationname\": \"49\",\n" +
            "        \"subsectorname\": \"Construction\",\n" +
            "        \"wagemax\": \"40\",\n" +
            "        \"wagemin\": \"15\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"Yes\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Requirements \\u0007 Proven experience as cook \\u0007 Experience in using cutting tools, cookware and bakeware \\u0007 Knowledge of various cooking procedures and methods (grilling, baking, boiling etc.) \\u0007 Accuracy and speed in executing assigned tasks \\u0007 Ability to work in a team \\u0007 Very good communication skills \\u0007 Excellent physical condition and stamina \\u0007 High school diploma or equivalent; Diploma from a culinary school will be an advantage \\u0007 Product Knowledge and Industry Experience, \\u0007 Leadership Skills, \\u0007 Strong Oral and Written Communication Skills, Motivational Skills, Self-Motivation, Customer Service Skills  High school diploma; food safety training will be considered an asset\",\n" +
            "        \"educationrequired\": \"High School/GED\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Far Rockaway\",\n" +
            "        \"leadfulfillmentcenter\": \"43816\",\n" +
            "        \"maxhoursperweek\": \"30\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Responsibilities: \\u0007 Set up workstations with all needed ingredients and cooking equipment \\u0007 Prepare ingredients to use in cooking (chopping and peeling vegetables, cutting meat etc.) \\u0007 Cook menu items in various utensils or grillers with cooperation of the kitchen staff \\u0007 Answer, report and follow executive or sous chefs instructions\",\n" +
            "        \"positiontitle\": \"Line Cook\",\n" +
            "        \"positiontype\": \"Food Service and Accommodations\",\n" +
            "        \"sectorname\": \"Accommodation & Food Services\",\n" +
            "        \"sococcupationcode\": \"74\",\n" +
            "        \"sococcupationname\": \"35\",\n" +
            "        \"subsectorname\": \"Full-Service Restaurants\",\n" +
            "        \"wagemax\": \"13\",\n" +
            "        \"wagemin\": \"13\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Candidates should have 6 months experience working in a fast paced environment. Servers must be able to multitask and operate in a loud and busy sports bar environment.\",\n" +
            "        \"educationrequired\": \"None\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Staten Island\",\n" +
            "        \"leadfulfillmentcenter\": \"43556\",\n" +
            "        \"maxhoursperweek\": \"30\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Local sports bar is looking to hire Servers for their new Staten Island location.\",\n" +
            "        \"positiontitle\": \"Server\",\n" +
            "        \"positiontype\": \"Food Service and Accommodations\",\n" +
            "        \"sectorname\": \"Accommodation & Food Services\",\n" +
            "        \"sococcupationcode\": \"4\",\n" +
            "        \"sococcupationname\": \"35\",\n" +
            "        \"subsectorname\": \"Food Services\",\n" +
            "        \"wagemax\": \"15\",\n" +
            "        \"wagemin\": \"15\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"Yes\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Must have a Valid Drivers License  At least 2 years of Plumbing experience required  Must have at least some Plumbing Service experience  OSHA 10 Preferred\",\n" +
            "        \"educationrequired\": \"High School/GED\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Industrial & Transportation Center\",\n" +
            "        \"leadfulfillmentcenter\": \"43347\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"NEW York Based Plumbing Company is seeking experienced Commercial Plumbers\",\n" +
            "        \"positiontitle\": \"Plumber\",\n" +
            "        \"positiontype\": \"Construction, Architecture\",\n" +
            "        \"sectorname\": \"Construction\",\n" +
            "        \"sococcupationcode\": \"81\",\n" +
            "        \"sococcupationname\": \"47\",\n" +
            "        \"subsectorname\": \"Construction\",\n" +
            "        \"wagemax\": \"30\",\n" +
            "        \"wagemin\": \"15\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"Yes\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Skills and Qualifications  Product Knowledge and Industry Experience, Leadership Skills, Strong Oral and Written Communication Skills, Motivational Skills, Results-Oriented, Employee Training Experience, Sales Skills, Self-Motivation, Strong Relationship Building, Customer Service Skills. High school diploma; food safety training will be considered an asset\",\n" +
            "        \"educationrequired\": \"High School/GED\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Far Rockaway\",\n" +
            "        \"leadfulfillmentcenter\": \"43817\",\n" +
            "        \"maxhoursperweek\": \"30\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Responsibilities  \\u0007 Make fresh coffee, replenishing supplies and condiments \\u0007 Maintaining inventory and taking beverage orders \\u0007 They must maintain cleanliness in food service areas and throughout the food establishment. \\u0007 Restock bag, forks napkins, menu, flyers \\u0007 Provide support in pick-up and delivery of customer orders. \\u0007 Ensure customer orders address and phone number is corrected when taking orders \\u0007 Call customers when pick-up orders are ready \\u0007 Ensure driver does take long to leave with a delivery order \\u0007 Respond to delivery related inquiries and concerns from customers. \\u0007 When cashing all void must be done by the manager on duty \\u0007 Count cash draw at the beginning of shift and remit daily sale \\u0007 Provide outstanding services and ensure customer satisfaction. \\u0007 A food handler card or permit required.\",\n" +
            "        \"positiontitle\": \"Server\",\n" +
            "        \"positiontype\": \"Food Service and Accommodations\",\n" +
            "        \"sectorname\": \"Accommodation & Food Services\",\n" +
            "        \"sococcupationcode\": \"74\",\n" +
            "        \"sococcupationname\": \"35\",\n" +
            "        \"subsectorname\": \"Full-Service Restaurants\",\n" +
            "        \"wagemax\": \"15\",\n" +
            "        \"wagemin\": \"15\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"All candidates must be able to work a flexible schedule, including nights, overnights and weekends. Candidate must have clean and valid NYS drivers license, 8 & 16 hour certificate and security guard license.\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Staten Island\",\n" +
            "        \"leadfulfillmentcenter\": \"43515\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Security company is hiring Security Guards for various locations. The Security Guards will work in residential, retail and commercial properties. They will watch for and report suspicious or unusual activity, investigate alarms and remove trespassers.\",\n" +
            "        \"positiontitle\": \"Security Guards\",\n" +
            "        \"positiontype\": \"Protective Service\",\n" +
            "        \"sectorname\": \"Administrative, Support, Waste Management and Remediation Services\",\n" +
            "        \"sococcupationcode\": \"4\",\n" +
            "        \"sococcupationname\": \"33\",\n" +
            "        \"subsectorname\": \"Investigation and Security Services\",\n" +
            "        \"wagemax\": \"13\",\n" +
            "        \"wagemin\": \"13\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"New York State security license required. Must be able to pass a background check. Must also be able to assist in emergency situations. Responsibilities include, but are not limited to, monitoring properties and maintaining daily logs and shift reports.\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Staten Island\",\n" +
            "        \"leadfulfillmentcenter\": \"43633\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"New York City based security company is hiring Security Guards for their Staten Island location. They have immediate openings for security professionals to work at a variety of locations throughout Staten Island. Responsibilities include: maintaining a safe environment for clients, employees and co-workers; promoting positive public relations by offering courteous services to all tenants, visitors and guests while responding to their requests; controlling access to the building and monitoring visitors' activities; being able to assist in emergency situations; and monitoring properties and maintaining daily logs and shift reports.\",\n" +
            "        \"positiontitle\": \"Security Guards\",\n" +
            "        \"positiontype\": \"Protective Service\",\n" +
            "        \"sectorname\": \"Administrative, Support, Waste Management and Remediation Services\",\n" +
            "        \"sococcupationcode\": \"4\",\n" +
            "        \"sococcupationname\": \"33\",\n" +
            "        \"subsectorname\": \"Investigation and Security Services\",\n" +
            "        \"wagemax\": \"13\",\n" +
            "        \"wagemin\": \"13\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"Yes\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Newly Welding Graduates welcomed to apply  At least 1 year of Welding experience preferred\",\n" +
            "        \"educationrequired\": \"Vocational\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Industrial & Transportation Center\",\n" +
            "        \"leadfulfillmentcenter\": \"43664\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"A NY based Welding Company is seeking Welders\",\n" +
            "        \"positiontitle\": \"Welder\",\n" +
            "        \"positiontype\": \"Manufacturing, Production, Energy\",\n" +
            "        \"sectorname\": \"Manufacturing\",\n" +
            "        \"sococcupationcode\": \"81\",\n" +
            "        \"sococcupationname\": \"51\",\n" +
            "        \"subsectorname\": \"All Other Manufacturing\",\n" +
            "        \"wagemax\": \"17\",\n" +
            "        \"wagemin\": \"13\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"Yes\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Must have 8 Hour and 16 Hour security certificates and NYS Driver's license.\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Coney Island (Sandy)\",\n" +
            "        \"leadfulfillmentcenter\": \"43836\",\n" +
            "        \"maxhoursperweek\": \"30\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Provide security services to maintain a safe environment for residents and staff. Duties include overall surveillance through performing facility rounds, maintain visitor log, conduct fire drills, and ensuring that rules and regulations are followed\",\n" +
            "        \"positiontitle\": \"Security Officers\",\n" +
            "        \"positiontype\": \"Protective Service\",\n" +
            "        \"sectorname\": \"Health Care & Social Assistance\",\n" +
            "        \"sococcupationcode\": \"77\",\n" +
            "        \"sococcupationname\": \"33\",\n" +
            "        \"subsectorname\": \"Vocational Rehab Services\",\n" +
            "        \"wagemax\": \"14\",\n" +
            "        \"wagemin\": \"13\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Candidates must me the minimum qualifications: Able to work Monday-Frdiday 8:30am to 4:30pm, Bilingual is preferred, Computer knowledge of Microsoft Office, Outlook, Knowledge and ability to travel within the borough of Queens\",\n" +
            "        \"educationrequired\": \"High School/GED\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Far Rockaway\",\n" +
            "        \"leadfulfillmentcenter\": \"43410\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"40\",\n" +
            "        \"positiondescription\": \"Hope Home Care is a licensed Home Care Agency that has been servicing the five boroughs for the past 30 years. They are seeking qualified individuals to be a part of the Marketing Department. Flyer Distributors must be able to communicate effectively and efficiently with the public and be able to work outside in all types of weather conditions.\",\n" +
            "        \"positiontitle\": \"Flyer Distributor\",\n" +
            "        \"positiontype\": \"Sales, Marketing, Wholesaling\",\n" +
            "        \"sectorname\": \"Administrative, Support, Waste Management and Remediation Services\",\n" +
            "        \"sococcupationcode\": \"74\",\n" +
            "        \"sococcupationname\": \"41\",\n" +
            "        \"subsectorname\": \"Employment Services / Temp Agencies\",\n" +
            "        \"wagemax\": \"13\",\n" +
            "        \"wagemin\": \"13\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"To be considered qualified for this position, candidate must have some experience and be willing to learn.\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Staten Island\",\n" +
            "        \"leadfulfillmentcenter\": \"43841\",\n" +
            "        \"maxhoursperweek\": \"30\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Local pizzeria is looking to hire a Counter Person for their Staten Island locations. Position entails taking orders, preparing orders, operating a POS system and cleaning as necessary.\",\n" +
            "        \"positiontitle\": \"Counter Person\",\n" +
            "        \"positiontype\": \"Food Service and Accommodations\",\n" +
            "        \"sectorname\": \"Accommodation & Food Services\",\n" +
            "        \"sococcupationcode\": \"4\",\n" +
            "        \"sococcupationname\": \"35\",\n" +
            "        \"subsectorname\": \"Food Services\",\n" +
            "        \"wagemax\": \"13.5\",\n" +
            "        \"wagemin\": \"13.5\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"The ideal candidate will have excellent customer service skills and be able to communicate effectively with customers and management. Candidates must be able to stand for the entire shift. Bending, lifting and stretching will also be required, as well as other duties as directed by management.\",\n" +
            "        \"educationrequired\": \"High School/GED\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Staten Island\",\n" +
            "        \"leadfulfillmentcenter\": \"43929\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"40\",\n" +
            "        \"positiondescription\": \"Retail clothing chain is looking to hire an Assistant Manager for their Staten Island location. The Sales Associates are responsible for positively contributing to a customer's shopping experience through knowledgeable, friendly and efficient service. They will greet and acknowledge all customers on the sales floor and provide assistance to customers by answering merchandise related questions. The Sales Associates will meet individual sales goals established by store management every day. They will also be responsible for replenishing merchandise.\",\n" +
            "        \"positiontitle\": \"Assistant Manager\",\n" +
            "        \"positiontype\": \"Sales, Marketing, Wholesaling\",\n" +
            "        \"sectorname\": \"Retail Trade\",\n" +
            "        \"sococcupationcode\": \"4\",\n" +
            "        \"sococcupationname\": \"41\",\n" +
            "        \"subsectorname\": \"Clothing Stores\",\n" +
            "        \"wagemax\": \"15\",\n" +
            "        \"wagemin\": \"14\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"Yes\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Active Listening  Giving full attention to what other people are saying, taking time to understand the points being made, asking questions as appropriate, and not interrupting at inappropriate times.   Critical Thinking  Using logic and reasoning to identify the strengths and weaknesses of alternative solutions, conclusions or approaches to problems.   Speaking  Talking to others to convey information effectively.   Complex Problem Solving  Identifying complex problems and reviewing related information to develop and evaluate options and implement solutions.   Coordination  Adjusting actions in relation to others' actions\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Industrial & Transportation Center\",\n" +
            "        \"leadfulfillmentcenter\": \"43831\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"40\",\n" +
            "        \"positiondescription\": \"Confer with supervisory personnel, owners, contractors, or design professionals to discuss and resolve matters such as work procedures, complaints, or construction problems.   Plan, schedule, or coordinate construction project activities to meet deadlines.   Prepare and submit budget estimates, progress reports, or cost tracking reports.   Inspect or review projects to monitor compliance with building and safety codes or other regulations.   Inspect or review projects to monitor compliance with environmental regulations.\",\n" +
            "        \"positiontitle\": \"Project Manager\",\n" +
            "        \"positiontype\": \"Construction, Architecture\",\n" +
            "        \"sectorname\": \"Construction\",\n" +
            "        \"sococcupationcode\": \"81\",\n" +
            "        \"sococcupationname\": \"47\",\n" +
            "        \"subsectorname\": \"Construction\",\n" +
            "        \"wagemax\": \"30\",\n" +
            "        \"wagemin\": \"20\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"Yes\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Master's Degree in Social Work. ? LMSW or licensure within three months of hire. ? Knowledge of child and adolescent mental health, and diagnostic classifications. ? Knowledge of policies and regulations relating to child welfare, safety, and well-being. ? Exceptional organizational skills and the ability to handle multiple projects and responsibilities simultaneously while maintaining high quality work. ? Bi-Lingual English/Spanish a plus.\",\n" +
            "        \"educationrequired\": \"Master's\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Healthcare Sector Center  LM\",\n" +
            "        \"leadfulfillmentcenter\": \"43873\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"The Case Worker position at Aguila, Inc. provides case management services to clients and manages the necessary charts for homeless families and individuals.\",\n" +
            "        \"positiontitle\": \"Case Worker\",\n" +
            "        \"positiontype\": \"Social Work, Child Care, Counseling\",\n" +
            "        \"sectorname\": \"Health Care & Social Assistance\",\n" +
            "        \"sococcupationcode\": \"75\",\n" +
            "        \"sococcupationname\": \"21\",\n" +
            "        \"subsectorname\": \"Other Healthcare\",\n" +
            "        \"wagemax\": \"15\",\n" +
            "        \"wagemin\": \"14\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"Yes\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"\\u0007 Graduate of accredited school of nursing, currently registered in New York State as a Registered Professional Nurse. \\u0007 AAS Degree in nursing or a graduate from an accredited hospital based nursing program required. Bachelors degree preferred. \\u0007 Minimum three years supervisory or middle management experience required and/or three years progressive nursing experience, preferably in an outpatient setting. \\u0007 Must be creative, intuitive team player with excellent communication, organizational and interpersonal skills. \\u0007 Computer literate. Working knowledge of EHRs\",\n" +
            "        \"educationrequired\": \"Associate's\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Healthcare Sector Center  LM\",\n" +
            "        \"leadfulfillmentcenter\": \"43910\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"\\u0007 Assumes responsibility and accountability for planning, organizing, coordinating, monitoring and evaluating the provision of services at the clinic site. \\u0007 Collaborates with the Sr. Practice Administrator in promoting quality patient care to the communities we serve through the appropriate utilization of resources and coordination of professional and ancillary staff. \\u0007 Provides direct patient care.\",\n" +
            "        \"positiontitle\": \"Practice Administrator RN\",\n" +
            "        \"positiontype\": \"Healthcare Practitioners and Support\",\n" +
            "        \"sectorname\": \"Health Care & Social Assistance\",\n" +
            "        \"sococcupationcode\": \"75\",\n" +
            "        \"sococcupationname\": \"29\",\n" +
            "        \"subsectorname\": \"Other Ambulatory Care: Offices of Physicians, Dentists, Labs, Outpatient Care, Ambulances\",\n" +
            "        \"wagemax\": \"40\",\n" +
            "        \"wagemin\": \"38\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"To be considered qualified for this position, candidates must have at least six months of food service experience.\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Staten Island\",\n" +
            "        \"leadfulfillmentcenter\": \"43787\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Sandwich franchise is looking to hire Food Service Team Members for their Staten Island location.\",\n" +
            "        \"positiontitle\": \"Food Service Team Member\",\n" +
            "        \"positiontype\": \"Food Service and Accommodations\",\n" +
            "        \"sectorname\": \"Accommodation & Food Services\",\n" +
            "        \"sococcupationcode\": \"4\",\n" +
            "        \"sococcupationname\": \"35\",\n" +
            "        \"subsectorname\": \"Limited-Service Restaurants\",\n" +
            "        \"wagemax\": \"17\",\n" +
            "        \"wagemin\": \"13\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"Yes\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Active Listening  Giving full attention to what other people are saying, taking time to understand the points being made, asking questions as appropriate, and not interrupting at inappropriate times.   Critical Thinking  Using logic and reasoning to identify the strengths and weaknesses of alternative solutions, conclusions or approaches to problems.   Speaking  Talking to others to convey information effectively.   Complex Problem Solving  Identifying complex problems and reviewing related information to develop and evaluate options and implement solutions.   Coordination  Adjusting actions in relation to others' actions.\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Industrial & Transportation Center\",\n" +
            "        \"leadfulfillmentcenter\": \"43868\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"40\",\n" +
            "        \"positiondescription\": \"Confer with supervisory personnel, owners, contractors, or design professionals to discuss and resolve matters such as work procedures, complaints, or construction problems.   Plan, schedule, or coordinate construction project activities to meet deadlines.  Prepare and submit budget estimates, progress reports, or cost tracking reports.    Inspect or review projects to monitor compliance with building and safety codes or other regulations.    Inspect or review projects to monitor compliance with environmental regulations\",\n" +
            "        \"positiontitle\": \"Labor Monitor\",\n" +
            "        \"positiontype\": \"Construction, Architecture\",\n" +
            "        \"sectorname\": \"Construction\",\n" +
            "        \"sococcupationcode\": \"81\",\n" +
            "        \"sococcupationname\": \"47\",\n" +
            "        \"subsectorname\": \"Construction\",\n" +
            "        \"wagemax\": \"16\",\n" +
            "        \"wagemin\": \"15\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"Yes\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"MSW or MHC from an accredited school; LMSW or LMHC required within 6 months of employment. ? Proficiency in Spanish is required. ? Knowledge of health-related factors in working with chronically ill children, as well as experience in the area of child development is a plus. ? Prior experience in preventive services, child welfare, and/or health care preferred. ? Work hours generally 9-5; but may require one evening or more for clients who need to be seen after 5 p.m.\",\n" +
            "        \"educationrequired\": \"Master's\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Healthcare Sector Center  LM\",\n" +
            "        \"leadfulfillmentcenter\": \"43900\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"New Alternatives for Children, Inc. (NAC) is an award-winning not-for-profit agency in Midtown Manhattan, with a satellite Bronx office, dedicated to serving children and families with medical complexities, disabilities, chronic illnesses and behavioral challenges. To assist us in this mission, NAC is currently seeking a Social Worker. This position offers highly rewarding experience for social work professionals who welcome the opportunity to build strong relationships with at-risk families within their communities. Its an exciting opportunity to be a part of multidisciplinary teams of professionals at an innovative agency serving the needs of some of the most vulnerable children and families in New York City.\",\n" +
            "        \"positiontitle\": \"Social Worker\",\n" +
            "        \"positiontype\": \"Social Work, Child Care, Counseling\",\n" +
            "        \"sectorname\": \"Health Care & Social Assistance\",\n" +
            "        \"sococcupationcode\": \"75\",\n" +
            "        \"sococcupationname\": \"21\",\n" +
            "        \"subsectorname\": \"Other Healthcare\",\n" +
            "        \"wagemax\": \"23\",\n" +
            "        \"wagemin\": \"22\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"Yes\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"At least 2 years of experience and NYS Driver's license.\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Coney Island (Sandy)\",\n" +
            "        \"leadfulfillmentcenter\": \"43834\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"40\",\n" +
            "        \"positiondescription\": \"Residential Specialists assist adults with intellectual and developmental disabilities, sensory impairments as well as complex medical and behavioral support needs in a residential setting\",\n" +
            "        \"positiontitle\": \"Residential Specialist\",\n" +
            "        \"positiontype\": \"Education, Library, Social Science\",\n" +
            "        \"sectorname\": \"Health Care & Social Assistance\",\n" +
            "        \"sococcupationcode\": \"77\",\n" +
            "        \"sococcupationname\": \"25\",\n" +
            "        \"subsectorname\": \"Vocational Rehab Services\",\n" +
            "        \"wagemax\": \"14\",\n" +
            "        \"wagemin\": \"13\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"Yes\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Degree in Social Services, or 60 College Credits and 2 years experience in the Social Services field. ? Strong organizational skills and attention to detail ? Working knowledge of Microsoft Office (Word and Excel) ? Excellent written and verbal skills ? Bilingual (English/Spanish) a plus but not required\",\n" +
            "        \"educationrequired\": \"Master's\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Healthcare Sector Center  LM\",\n" +
            "        \"leadfulfillmentcenter\": \"43872\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"The Case Manager position at Aguila, Inc. provides case management services to clients and manages the necessary charts for homeless families and individuals.\",\n" +
            "        \"positiontitle\": \"Case Manager\",\n" +
            "        \"positiontype\": \"Social Work, Child Care, Counseling\",\n" +
            "        \"sectorname\": \"Health Care & Social Assistance\",\n" +
            "        \"sococcupationcode\": \"75\",\n" +
            "        \"sococcupationname\": \"21\",\n" +
            "        \"subsectorname\": \"Other Healthcare\",\n" +
            "        \"wagemax\": \"21\",\n" +
            "        \"wagemin\": \"18\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"Candidates must be proficient at selling products, services and solutions by getting to know customers and helping solve their unique end-to-end needs. They must ask lifestyle questions to thoroughly understand customer needs and offer solutions so the customer can make informed decisions to complete their purchase. Candidates must utilize all relevant sales tools to drive profitable growth and leverage online resources, tools and peer knowledge to self-train. They must attend and participate in all required training's and meetings. Candidates must be able to lift up to 50 lbs and stand/move for most, if not all, of their shift.\",\n" +
            "        \"educationrequired\": \"None\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Staten Island\",\n" +
            "        \"leadfulfillmentcenter\": \"44087\",\n" +
            "        \"maxhoursperweek\": \"30\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Large home media and electronics store in Staten Island is hiring Sales Associates, who are expected to warmly welcome customers to the store and seek out opportunities to greet customers. The Sales Associate should speak to customers to find out what type of product they are looking for, as well as obtain details on the type of features the customer wants. They should point customers to products that will meet their needs. Sales Associates will have the opportunity to develop their communication skills, train on their attention to detail, and build on their natural talents and strengths in a high-energy, value-based environment.\",\n" +
            "        \"positiontitle\": \"Sales Associates\",\n" +
            "        \"positiontype\": \"Sales, Marketing, Wholesaling\",\n" +
            "        \"sectorname\": \"Retail Trade\",\n" +
            "        \"sococcupationcode\": \"4\",\n" +
            "        \"sococcupationname\": \"41\",\n" +
            "        \"subsectorname\": \"Electronic and Appliances Stores\",\n" +
            "        \"wagemax\": \"13\",\n" +
            "        \"wagemin\": \"13\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"Yes\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"To be considered qualified for this position, candidates must have least six months experience in a fast paced restaurant.\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Staten Island\",\n" +
            "        \"leadfulfillmentcenter\": \"44129\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"40\",\n" +
            "        \"positiondescription\": \"New Mexican Restaurant is looking to hire Food Service Team Members for their full service restaurant.\",\n" +
            "        \"positiontitle\": \"Food Service Team Member\",\n" +
            "        \"positiontype\": \"Food Service and Accommodations\",\n" +
            "        \"sectorname\": \"Accommodation & Food Services\",\n" +
            "        \"sococcupationcode\": \"4\",\n" +
            "        \"sococcupationname\": \"35\",\n" +
            "        \"subsectorname\": \"Full-Service Restaurants\",\n" +
            "        \"wagemax\": \"15\",\n" +
            "        \"wagemin\": \"13\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"Yes\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"No\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"LMSW/LCSW  MSW\",\n" +
            "        \"educationrequired\": \"Master's\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Healthcare Sector Center  LM\",\n" +
            "        \"leadfulfillmentcenter\": \"44213\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"The Client Care Coordinator (CCC) will serve to improve access to mental health services in the Family with Children shelter system and assist families that are homeless as they navigate multiple systems and cope with the stress and anxiety induced by homelessness. The CCC will achieve this through enhanced delivery and coordination of mental health, substance abuse, and related services; promotion and modeling of best practices for shelter social services provider staff; improving linkages to mental health and community based services; increasing the ability of shelter social services staff to address mental health issues in a culturally and linguistically competent manner that incorporates strengths-based, family-driven and youth/child-guided care.\",\n" +
            "        \"positiontitle\": \"Client Care Coordinator\",\n" +
            "        \"positiontype\": \"Social Work, Child Care, Counseling\",\n" +
            "        \"sectorname\": \"Health Care & Social Assistance\",\n" +
            "        \"sococcupationcode\": \"75\",\n" +
            "        \"sococcupationname\": \"21\",\n" +
            "        \"subsectorname\": \"Social Assistance (excluding Child Day Care)\",\n" +
            "        \"wagemax\": \"28\",\n" +
            "        \"wagemin\": \"27\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"boroughbronx\": \"No\",\n" +
            "        \"boroughbrooklyn\": \"No\",\n" +
            "        \"boroughmanhattan\": \"Yes\",\n" +
            "        \"boroughnonnyc\": \"No\",\n" +
            "        \"boroughqueens\": \"No\",\n" +
            "        \"boroughstatenisland\": \"No\",\n" +
            "        \"candidateexperiencequalificationsskills\": \"experience in providing advocacy services to people who are mentally ill and/or homeless .\",\n" +
            "        \"educationrequired\": \"High School Diploma\",\n" +
            "        \"hourlyannual\": \"Hourly\",\n" +
            "        \"jobfamilyname\": \"Healthcare Sector Center  LM\",\n" +
            "        \"leadfulfillmentcenter\": \"44265\",\n" +
            "        \"maxhoursperweek\": \"40\",\n" +
            "        \"minhoursperweek\": \"30\",\n" +
            "        \"positiondescription\": \"Under the general supervision of the HCBS Program Director, Peer Specialists serve as role models, educate recipients about self-help techniques and self-help group processes, teach effective coping strategies based on personal experience , teach symptom management skills , assist in clarifying rehabilitation and recovery goals and assist in the development of community support systems and networks. The Peer Specialist assists assigned individuals in developing and maintaining viable living, working and social situations in the community by obtaining needed medical, social, psychosocial, educational, financial, vocational, and other services. Travels to/visits recipients' residences or apartments to provide counsel and assistance and to help the recipients , within their capabilities and interests, in maintaining the greatest degree of independent living.\",\n" +
            "        \"positiontitle\": \"Peer Specialist\",\n" +
            "        \"positiontype\": \"Social Work, Child Care, Counseling\",\n" +
            "        \"sectorname\": \"Health Care & Social Assistance\",\n" +
            "        \"sococcupationcode\": \"75\",\n" +
            "        \"sococcupationname\": \"21\",\n" +
            "        \"subsectorname\": \"Social Assistance (excluding Child Day Care)\",\n" +
            "        \"wagemax\": \"15\",\n" +
            "        \"wagemin\": \"15\"\n" +
            "    },\n" +
            "]}";

    public static List<Job> getListFromJSON() throws JSONException {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(jobsJSON);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONArray jsonArray = jsonObject.getJSONArray("array");
        List<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jsonArray.length()-1; i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String bx = obj.getString("boroughbronx");
            String bk = obj.getString("boroughbrooklyn");
            String mn = obj.getString("boroughmanhattan");
            String si = obj.getString("boroughstatenisland");
            String non = obj.getString("boroughnonnyc");
            String qualifications = "";
            if (obj.getString("candidateexperiencequalificationsskills") == null) {
                qualifications = "N/A";
            } else {
                qualifications = obj.getString("candidateexperiencequalificationsskills");
            }
            String edu = obj.getString("educationrequired");
            String hourly = obj.getString("hourlyannual");
            int maxH = Integer.parseInt(obj.getString("maxhoursperweek"));
            int minH = Integer.parseInt(obj.getString("minhoursperweek"));
            String desc = obj.getString("positiondescription");
            String title = obj.getString("positiontitle");
            String type = obj.getString("positiontype");
            String sector = obj.getString("sectorname");
            double minW = Double.parseDouble(obj.getString("wagemin"));
            double maxW = Double.parseDouble(obj.getString("wagemax"));

            Job job = new Job();
            job.setBoroughBronx(Job.yesNoToBoolean(bx));
            job.setBoroughBrooklyn(Job.yesNoToBoolean(bk));
            job.setBoroughManhattan(Job.yesNoToBoolean(mn));
            job.setBoroughStatenIsland(Job.yesNoToBoolean(si));
            job.setBoroughNonNyc(Job.yesNoToBoolean(non));
            job.setCandidateExperienceQualificationSkills(qualifications);
            job.setEducationRequired(edu);
            job.setHourlyAnnual(hourly);
            job.setMaxHoursPerWeek(maxH);
            job.setMinHoursPerWeek(minH);
            job.setPositionDescritption(desc);
            job.setPositionTitle(title);
            job.setPositionType(type);
            job.setSectorName(sector);
            job.setWageMin(minW);
            job.setWageMax(maxW);
            jobs.add(job);
        }
        return jobs;
    }

}
