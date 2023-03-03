using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace fundProject.Controllers.employee
{
    public class ChatHomeController : Controller
    {
        // GET: ChatHome
        public ActionResult Chat()
        {
            if (Session["username"] == null)
            {
                return RedirectToAction("Index", "Login");
            }
            return View("~/Views/employee/ChatHome/Chat.cshtml");
        }
    }
}