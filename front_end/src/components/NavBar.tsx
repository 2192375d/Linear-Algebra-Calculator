
"use client";
import { House, User } from "lucide-react"
import { FixedNav } from "./ui/fixed-navbar";
import { FloatingNav } from "./ui/floating-navbar";

const NavBar = () => {
  const navItems = [
    {
      name: "Home",
      link: "/",
      icon: <House className="h-4 w-4 text-neutral-500 dark:text-white" />,
    },
    {
      name: "About",
      link: "/about",
      icon: <User className="h-4 w-4 text-neutral-500 dark:text-white" />,
    },
  ];

  return (
    <>
      <FixedNav navItems={navItems} />
      <FloatingNav navItems={navItems} />
    </>
  )
}

export default NavBar;
