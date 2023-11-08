SELECT 
    group_name AS name,
    COUNT(*) AS all_test_cases,
    SUM(CASE WHEN status = 'OK' THEN 1 ELSE 0 END) AS passed_test_cases,
    SUM(CASE WHEN status = 'OK' THEN test_value ELSE 0 END) AS total_value
FROM 
    test_groups
JOIN 
    test_cases ON test_groups.name = test_cases.group_name
GROUP BY 
    group_name
ORDER BY 
    total_value DESC, name ASC;