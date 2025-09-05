function showCourses(){
    fetch("http://localhost:8080/courses")
    .then((res)=>res.json())
    .then((data)=>{
        const dataTable = document.getElementById("courseTable");
    
        data.forEach(course => {
            let row = `<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.courseTrainer}</td>
            <td>${course.duration}</td>
            </tr>`
            dataTable.innerHTML+= row;
        });
    });
}
function showEnrolledStudents(){
    fetch("http://localhost:8080/courses/enrolled")
    .then((res)=>res.json())
    .then((data)=>{
        const dataTable = document.getElementById("enrollTable");
    
        data.forEach(course => {
            let row = `<tr>
            <td>${course.id}</td>
            <td>${course.name}</td>
            <td>${course.emailId}</td>
            <td>${course.courseName}</td>
            </tr>`
            dataTable.innerHTML+= row;
        });
    });
}